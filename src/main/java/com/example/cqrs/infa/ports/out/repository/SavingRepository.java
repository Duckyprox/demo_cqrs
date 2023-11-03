package com.example.cqrs.infa.ports.out.repository;

import java.io.Serializable;

public interface SavingRepository<T extends Serializable, U extends Serializable> {
    void save(T t);

    void update(T t);

    void deleteUserById(Integer id);
}
