package jt.nix.model.dao.hibernate;


import jt.nix.model.entity.Group0;
import org.hibernate.Query;
import java.util.List;


public class Group0HibernateDao extends AbstractHibernateDao<Group0> {
    @Override
    public void saveOrUpdate(Group0 persistent) {
        getSession().saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
      Query query = getSession().createQuery("delete Group0 where id= :groupID");
        query.setLong("groupID", id);
        query.executeUpdate();
    }

    @Override
    public void delete(Group0 persistent) {
        getSession().delete(persistent);
    }

    @Override
    public Group0 get(Long id) {
        return (Group0)getSession().load(Group0.class, id);
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public List<Group0> getAll() {
        return getSession().createQuery("from Group0").list();
    }




}
