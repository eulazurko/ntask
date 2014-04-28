package jt.nix.model.dao.hibernate;


import jt.nix.model.entity.Semester;
import org.hibernate.Query;

import java.util.List;


public class SemesterHibernateDao extends AbstractHibernateDao<Semester> {
    @Override
    public void saveOrUpdate(Semester persistent) {
        getSession().saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete Semester where id= :semesterID");
        query.setLong("semesterID", id);
        query.executeUpdate();
    }

    @Override
    public void delete(Semester persistent) {
        getSession().delete(persistent);
    }

    @Override
    public Semester get(Long id) {
        return (Semester)getSession().load(Semester.class, id);
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public List<Semester> getAll() {
        return getSession().createQuery("from Semester").list();
    }


}
