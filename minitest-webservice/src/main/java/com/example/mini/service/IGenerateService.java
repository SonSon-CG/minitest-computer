package com.example.mini.service;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();

   T save(T t);

    Optional<T> findById(Long id);

    void remove(Long id);
}
