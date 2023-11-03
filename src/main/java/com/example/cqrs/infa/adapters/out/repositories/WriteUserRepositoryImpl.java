package com.example.cqrs.infa.adapters.out.repositories;

import com.example.cqrs.domain.model.User;
import com.example.cqrs.infa.ports.out.repository.SavingRepository;

public class WriteUserRepositoryImpl implements SavingRepository<User, Integer> {

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deleteUserById(Integer id) {

    }
}
