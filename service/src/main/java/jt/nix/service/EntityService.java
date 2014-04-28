package jt.nix.service;

import jt.nix.model.entity.Persistent;

import java.util.List;

public interface EntityService<T extends Persistent> {
    void saveOrUpdate(T persistent);
    void delete(Long id);
    void delete(T persistent);
    T get(Long id);
    List<T> getAll();

}
