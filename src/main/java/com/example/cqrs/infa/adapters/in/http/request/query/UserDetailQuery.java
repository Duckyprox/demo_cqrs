package com.example.cqrs.infa.adapters.in.http.request.query;

import com.example.cqrs.app.mediator.Request;
import com.example.cqrs.infa.adapters.in.http.dtos.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailQuery implements Request<UserDTO> {
    private String username;
}
