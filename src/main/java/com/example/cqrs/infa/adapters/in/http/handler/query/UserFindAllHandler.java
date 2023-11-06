package com.example.cqrs.infa.adapters.in.http.handler.query;

import com.example.cqrs.app.util.UserUtil;
import com.example.cqrs.domain.model.User;
import com.example.cqrs.app.mediator.RequestHandler;
import com.example.cqrs.infa.adapters.in.http.dtos.UserDTO;
import com.example.cqrs.infa.adapters.in.http.request.query.UserFindAllQuery;
import com.example.cqrs.infa.ports.out.repository.ReadOnlyRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserFindAllHandler implements RequestHandler<UserFindAllQuery, List<UserDTO>> {

    private final ReadOnlyRepository<User, Integer> readOnlyRepository;

    public UserFindAllHandler(ReadOnlyRepository<User, Integer> readOnlyRepository) {
        this.readOnlyRepository = readOnlyRepository;
    }

    @Override
    public List<UserDTO> handle(UserFindAllQuery request) {
//        return UserUtil.getUsers().stream()
//                       .map(value -> new UserDTO(value.getName(), value.getRole().getCode()))
//                       .collect(Collectors.toList());
        return null;
    }
}
