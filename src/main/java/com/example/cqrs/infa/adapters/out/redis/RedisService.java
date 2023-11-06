package com.example.cqrs.infa.adapters.out.redis;

import com.example.cqrs.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RedisService {

    private static final String HASH_KEY = "User";

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;
    private HashOperations<Object, String, User> hashOperations;

    @Autowired
    public RedisService(RedisTemplate<Object, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.hashOperations = redisTemplate.opsForHash();
    }

    public void save(User user) {
        hashOperations.put(HASH_KEY, user.getName(), user);
    }

    public Map<String, User> findAll() {
        return hashOperations.entries(HASH_KEY);
    }

    public User findById(String id) {
        return hashOperations.get(HASH_KEY, id);
    }

    public void update(User user) {
        save(user);
    }

    public void delete(String id) {
        hashOperations.delete(HASH_KEY, id);
    }
}
