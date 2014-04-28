package jt.nix.model.dao.hibernate;


import jt.nix.model.entity.Subject;
import org.hibernate.Query;

import java.util.List;


public class SubjectHibernateDao extends AbstractHibernateDao<Subject> {
    @Override
    public void saveOrUpdate(Subject persistent) {
        getSession().saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete Subject where id= :subjectID");
        query.setLong("subjectID", id);
        query.executeUpdate();
    }

    @Override
    public void delete(Subject persistent) {
        getSession().delete(persistent);
    }

    @Override
    public Subject get(Long id) {
        return (Subject)getSession().load(Subject.class, id);
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public List<Subject> getAll() {
        return getSession().createQuery("from Subject").list();
    }
}
