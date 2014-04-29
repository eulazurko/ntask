package jt.nix.service.transactional;

import jt.nix.model.dao.Dao;
import jt.nix.model.entity.Group0;
import jt.nix.model.entity.SubSem;
import jt.nix.model.entity.Subject;
import jt.nix.service.SubSemService;

import java.util.List;

public class SubSemTransactService implements SubSemService {

    private Dao<SubSem> subSemDao;

    public SubSemTransactService(Dao<SubSem> group0Dao) {
        this.subSemDao = subSemDao;
    }

    public SubSemTransactService() {
    }

    @Override
    public void saveOrUpdate(SubSem persistent) {
      subSemDao.saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        subSemDao.delete(id);
    }

    @Override
    public void delete(SubSem persistent) {
        subSemDao.delete(persistent);
    }

    @Override
    public SubSem get(Long id) {
        return subSemDao.get(id);
    }

    @Override
    public List<SubSem> getAll() {
        return subSemDao.getAll();
    }


}
