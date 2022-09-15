package com.example.product_manager_thymeleaf.service;

import java.util.List;

public interface IGenarateService<T> {
    List<T> findAll();
    void save(T t);
    T findById(int id);
    void update(int id, T t);
    void remove(int id);
}
