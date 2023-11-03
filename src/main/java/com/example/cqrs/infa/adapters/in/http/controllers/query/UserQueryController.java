package com.example.cqrs.infa.adapters.in.http.controllers.query;

import com.example.cqrs.app.mediator.QueryGateway;
import com.example.cqrs.infa.adapters.in.http.dtos.UserDTO;
import com.example.cqrs.app.mediator.Mediator;
import com.example.cqrs.infa.adapters.in.http.request.query.UserDetailQuery;
import com.example.cqrs.infa.adapters.in.http.request.query.UserFindAllQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/q")
@RestController
public class UserQueryController {
    private final QueryGateway queryGateway;

    public UserQueryController(Mediator mediator) {
        this.queryGateway = new QueryGateway(mediator);
    }

    @GetMapping("/findByUsername")
    public ResponseEntity<?> getUserByUsername(@RequestParam String username) {
        UserDTO user = queryGateway.send(new UserDetailQuery(username));
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> getAllUser() {
        List<UserDTO> users = queryGateway.send(new UserFindAllQuery());
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
