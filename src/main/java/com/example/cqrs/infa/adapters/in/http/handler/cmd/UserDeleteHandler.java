package com.example.cqrs.infa.adapters.in.http.handler.cmd;

import com.example.cqrs.app.mediator.RequestHandler;
import com.example.cqrs.infa.ports.out.repository.SavingRepository;
import com.example.cqrs.infa.adapters.in.http.request.cmd.UserDeleteCmd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDeleteHandler implements RequestHandler<UserDeleteCmd, Void> {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDeleteHandler.class);

    private final SavingRepository savingRepository;

    public UserDeleteHandler(SavingRepository savingRepository) {
        this.savingRepository = savingRepository;
    }

    @Override
    public Void handle(UserDeleteCmd request) {
        savingRepository.deleteUserById(request.getId());
        LOGGER.info("delete user successful. user_id = {}", request.getId());

        return null;
    }
}
