package com.example.cqrs.infa.ports.out.repository;

import java.io.Serializable;
import java.util.List;

public interface ReadOnlyRepository<T extends Serializable, U extends Serializable> {
    T findOne(Integer U);

    T findOneByName(String userName);

    List<T> findAll();
}
