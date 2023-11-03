package com.example.cqrs.infa.adapters.in.http.request.query;

import com.example.cqrs.app.mediator.Request;
import com.example.cqrs.infa.adapters.in.http.dtos.UserDTO;

import java.util.List;

public class UserFindAllQuery implements Request<List<UserDTO>> {
}
