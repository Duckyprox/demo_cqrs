package com.example.cqrs.app.mediator;

public class CommandGateway extends CommonMediator {
    public CommandGateway(Mediator mediator) {
        super(mediator);
    }
}
