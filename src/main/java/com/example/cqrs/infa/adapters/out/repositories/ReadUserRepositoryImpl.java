package com.example.cqrs.infa.adapters.out.repositories;

import com.example.cqrs.domain.model.User;
import com.example.cqrs.infa.ports.out.repository.ReadOnlyRepository;
import com.example.cqrs.app.util.UserUtil;

import java.util.ArrayList;
import java.util.List;

public class ReadUserRepositoryImpl implements ReadOnlyRepository<User, Integer> {

    @Override
    public User findOne(Integer id) {
        return UserUtil.getUsers().stream()
                       .filter(x -> id.equals(x.getId()))
                       .findFirst()
                       .orElse(null);
    }

    @Override
    public User findOneByName(String userName) {
        return UserUtil.getUsers().stream()
                       .filter(x -> userName.equals(x.getName()))
                       .findFirst()
                       .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(UserUtil.getUsers());
    }
}
