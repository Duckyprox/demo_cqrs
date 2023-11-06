package com.example.cqrs.infa.adapters.in.http.handler.query;

import com.example.cqrs.app.util.UserUtil;
import com.example.cqrs.domain.model.User;
import com.example.cqrs.infa.adapters.in.http.dtos.UserDTO;
import com.example.cqrs.infa.ports.out.repository.ReadOnlyRepository;
import com.example.cqrs.app.mediator.RequestHandler;
import com.example.cqrs.infa.adapters.in.http.request.query.UserDetailQuery;
import org.springframework.stereotype.Component;

@Component
public class UserDetailHandler implements RequestHandler<UserDetailQuery, UserDTO> {

    private final ReadOnlyRepository<User, Integer> readOnlyRepository;

    public UserDetailHandler(ReadOnlyRepository<User, Integer> readOnlyRepository) {
        this.readOnlyRepository = readOnlyRepository;
    }

    @Override
    public UserDTO handle(UserDetailQuery request) {
//        return UserUtil.getUsers()
//                       .stream()
//                       .filter(x -> request.getUsername().equals(x.getName())).findFirst()
//                       .map(value -> new UserDTO(value.getName(), value.getRole().getCode()))
//                       .orElse(null);
        return null;
    }
}
