package jt.nix.service.transactional;

import jt.nix.model.dao.Dao;
import jt.nix.model.entity.Group0;
import jt.nix.service.Group0Service;


import java.util.List;

public class Group0TransactService implements Group0Service {

    private Dao<Group0> group0Dao;

    public Group0TransactService(Dao<Group0> group0Dao) {
        this.group0Dao = group0Dao;
    }

    public Group0TransactService() {
    }

    @Override
    public void saveOrUpdate(Group0 persistent) {
      group0Dao.saveOrUpdate(persistent);
    }

    @Override
    public void delete(Long id) {
        group0Dao.delete(id);
    }

    @Override
    public void delete(Group0 persistent) {
        group0Dao.delete(persistent);
    }

    @Override
    public Group0 get(Long id) {
        return group0Dao.get(id);
    }

    @Override
    public List<Group0> getAll() {
        return group0Dao.getAll();
    }


}
