package com.example.cqrs.infa.adapters.in.http.handler.cmd;

import com.example.cqrs.app.mediator.RequestHandler;
import com.example.cqrs.app.util.UserUtil;
import com.example.cqrs.domain.model.User;
import com.example.cqrs.infa.adapters.in.http.request.cmd.UserCreateCmd;
import com.example.cqrs.infa.adapters.out.repositories.PostGrUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserCreateHandler implements RequestHandler<UserCreateCmd, Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserCreateHandler.class);

    private final PostGrUserRepository postGrUserRepository;

    public UserCreateHandler(PostGrUserRepository postGrUserRepository) {
        this.postGrUserRepository = postGrUserRepository;
    }

    @Override
    public Void handle(UserCreateCmd request) {
        int id = UserUtil.getUsers().size() + 1;
        postGrUserRepository.save((new User(id, "User_" + id)));
        LOGGER.info("create user successful. user_id = {}", id);
        return null;
    }
}
