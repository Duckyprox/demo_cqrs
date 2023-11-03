package com.example.cqrs.infa.adapters.in.http.request.cmd;

import com.example.cqrs.app.mediator.Request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDeleteCmd implements Request<Void> {
    private Integer id;
}
