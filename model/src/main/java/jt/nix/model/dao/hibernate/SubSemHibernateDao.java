package jt.nix.model.dao.hibernate;


import jt.nix.model.entity.SubSem;
import org.hibernate.Query;

import java.util.List;


public class SubSemHibernateDao extends AbstractHibernateDao<SubSem> {
    @Override
    public void saveOrUpdate(SubSem persistent) {
        getSession().saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete SubSem where id= :subSemID");
        query.setLong("subSemID", id);
        query.executeUpdate();
    }

    @Override
    public void delete(SubSem persistent) {
        getSession().delete(persistent);
    }

    @Override
    public SubSem get(Long id) {
        return (SubSem)getSession().load(SubSem.class, id);
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public List<SubSem> getAll() {
        return getSession().createQuery("from SubSem").list();
    }
}
