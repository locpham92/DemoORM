package com.codegym.demoorm.repository;

import java.util.List;

public interface IGenerateRepository<T> {
    List<T> findAll();
    T findById(Long id);
    List<T> findByName(String name);
    void save(T t);
    void remove(Long id);

}
