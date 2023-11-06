package com.example.cqrs.infa.adapters.in.http.controllers.redis;

import com.example.cqrs.domain.model.User;
import com.example.cqrs.infa.adapters.out.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/r/user")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping
    public void addStudent(@RequestBody User user) {
        redisService.save(user);
    }

    @GetMapping
    public Map<String, User> getAllUsers() {
        return redisService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return redisService.findById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable String id, @RequestBody User user) {
        User existingUser = redisService.findById(id);
        if (existingUser != null) {
            user.setId(Integer.valueOf(id));
            redisService.update(user);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        redisService.delete(id);
    }
}
