package com.example.cqrs.domain.repository;

import com.example.cqrs.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<User> findByName(String userName);

    Optional<User> findOne(Integer id);

    List<User> findAll();
}
