package com.example.cqrs.infa.adapters.out.repositories;

import com.example.cqrs.domain.model.User;
import com.example.cqrs.domain.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PostGrUserRepositoryImpl implements UserRepository {

    private final PostGrUserRepository postGrUserRepository;

    public PostGrUserRepositoryImpl(PostGrUserRepository postGrUserRepository) {
        this.postGrUserRepository = postGrUserRepository;
    }

    @Override
    public Optional<User> findByName(String userName) {
        return postGrUserRepository.findByName(userName);
    }

    @Override
    public Optional<User> findOne(Integer id) {
        return postGrUserRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return postGrUserRepository.findAll();
    }
}
