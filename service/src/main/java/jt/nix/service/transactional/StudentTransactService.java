package jt.nix.service.transactional;

import jt.nix.model.dao.Dao;
import jt.nix.model.entity.Group0;
import jt.nix.model.entity.Student;
import jt.nix.service.Group0Service;
import jt.nix.service.StudentService;

import java.util.List;

public class StudentTransactService implements StudentService {

    private Dao<Student> studentDao;

    public StudentTransactService(Dao<Student> group0Dao) {
        this.studentDao = studentDao;
    }

    public StudentTransactService() {
    }

    @Override
    public void saveOrUpdate(Student persistent) {
      studentDao.saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        studentDao.delete(id);
    }

    @Override
    public void delete(Student persistent) {
        studentDao.delete(persistent);
    }

    @Override
    public Student get(Long id) {
        return studentDao.get(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }


}
