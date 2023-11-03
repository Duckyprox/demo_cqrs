package com.example.cqrs.infa.adapters.in.http.controllers.cmd;

import com.example.cqrs.app.mediator.CommandGateway;
import com.example.cqrs.app.mediator.Mediator;
import com.example.cqrs.infa.adapters.in.http.request.cmd.UserCreateCmd;
import com.example.cqrs.infa.adapters.in.http.request.cmd.UserDeleteCmd;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/w")
public class UserCmdController {
    private final CommandGateway commandGateway;

    public UserCmdController(Mediator mediator) {
        this.commandGateway = new CommandGateway(mediator);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(UserCreateCmd cmd) {
        commandGateway.send(cmd);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteUser(@RequestParam Integer id) {
        commandGateway.send(new UserDeleteCmd(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
