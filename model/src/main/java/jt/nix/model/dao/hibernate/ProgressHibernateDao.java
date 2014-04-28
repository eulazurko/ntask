package jt.nix.model.dao.hibernate;


import jt.nix.model.entity.Progress;
import org.hibernate.Query;

import java.util.List;


public class ProgressHibernateDao extends AbstractHibernateDao<Progress> {
    @Override
    public void saveOrUpdate(Progress persistent) {
        getSession().saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete Progress where id= :progressID");
        query.setLong("progressID", id);
        query.executeUpdate();
    }

    @Override
    public void delete(Progress persistent) {
        getSession().delete(persistent);
    }

    @Override
    public Progress get(Long id) {
        return (Progress)getSession().load(Progress.class, id);
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public List<Progress> getAll() {
        return getSession().createQuery("from Progress").list();
    }
}
