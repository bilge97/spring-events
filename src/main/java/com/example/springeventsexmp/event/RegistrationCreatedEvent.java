package com.example.springeventsexmp.event;

import org.springframework.context.ApplicationEvent;

public class RegistrationCreatedEvent extends ApplicationEvent {
    public RegistrationCreatedEvent(Object source) {
        super(source);
    }
}
