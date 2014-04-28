package jt.nix.model.dao.hibernate;


import jt.nix.model.entity.Student;
import org.hibernate.Query;

import java.util.List;


public class StudentHibernateDao extends AbstractHibernateDao<Student> {
    @Override
    public void saveOrUpdate(Student persistent) {
        getSession().saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete Student where id= :studentID");
        query.setLong("studentID", id);
        query.executeUpdate();
    }

    @Override
    public void delete(Student persistent) {
        getSession().delete(persistent);
    }

    @Override
    public Student get(Long id) {
        return (Student)getSession().load(Student.class, id);
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public List<Student> getAll() {
        return getSession().createQuery("from Student").list();
    }
}
