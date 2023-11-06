package com.example.cqrs.infa.adapters.out.repositories;

import com.example.cqrs.domain.model.User;
import com.example.cqrs.domain.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface PostGrUserRepository extends JpaRepository<User, Integer>, UserRepository {

    Optional<User> findByName(String name);
}
