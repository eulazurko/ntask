package jt.nix.service.transactional;

import jt.nix.model.dao.Dao;
import jt.nix.model.entity.Group0;
import jt.nix.model.entity.Semester;
import jt.nix.model.entity.Subject;
import jt.nix.service.SemesterService;

import java.util.List;

public class SemesterTransactService implements SemesterService {

    private Dao<Semester> semesterDao;

    public SemesterTransactService(Dao<Semester> group0Dao) {
        this.semesterDao = semesterDao;
    }

    public SemesterTransactService() {
    }

    @Override
    public void saveOrUpdate(Semester persistent) {
      semesterDao.saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        semesterDao.delete(id);
    }

    @Override
    public void delete(Semester persistent) {
        semesterDao.delete(persistent);
    }

    @Override
    public Semester get(Long id) {
        return semesterDao.get(id);
    }

    @Override
    public List<Semester> getAll() {
        return semesterDao.getAll();
    }


}
