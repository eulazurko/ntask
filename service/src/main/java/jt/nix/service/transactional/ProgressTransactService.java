package jt.nix.service.transactional;

import jt.nix.model.dao.Dao;
import jt.nix.model.entity.Progress;
import jt.nix.model.entity.SubSem;
import jt.nix.service.ProgressService;

import java.util.List;

public class ProgressTransactService implements ProgressService {

    private Dao<Progress> progressDao;

    public ProgressTransactService(Dao<Progress> group0Dao) {
        this.progressDao = progressDao;
    }

    public ProgressTransactService() {
    }

    @Override
    public void saveOrUpdate(Progress persistent) {
      progressDao.saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        progressDao.delete(id);
    }

    @Override
    public void delete(Progress persistent) {
        progressDao.delete(persistent);
    }

    @Override
    public Progress get(Long id) {
        return progressDao.get(id);
    }

    @Override
    public List<Progress> getAll() {
        return progressDao.getAll();
    }


}
