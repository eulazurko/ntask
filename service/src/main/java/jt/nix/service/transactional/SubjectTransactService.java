package jt.nix.service.transactional;

import jt.nix.model.dao.Dao;
import jt.nix.model.entity.Group0;
import jt.nix.model.entity.Student;
import jt.nix.model.entity.Subject;
import jt.nix.service.SubjectService;

import java.util.List;

public class SubjectTransactService implements SubjectService {

    private Dao<Subject> subjectDao;

    public SubjectTransactService(Dao<Subject> group0Dao) {
        this.subjectDao = subjectDao;
    }

    public SubjectTransactService() {
    }

    @Override
    public void saveOrUpdate(Subject persistent) {
      subjectDao.saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        subjectDao.delete(id);
    }

    @Override
    public void delete(Subject persistent) {
        subjectDao.delete(persistent);
    }

    @Override
    public Subject get(Long id) {
        return subjectDao.get(id);
    }

    @Override
    public List<Subject> getAll() {
        return subjectDao.getAll();
    }


}
