package com.example.springeventsexmp.event.listener;

import com.example.springeventsexmp.event.RegistrationCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RegistrationEventListener {

    @EventListener
    public void registrationEventHandler(RegistrationCreatedEvent registrationCreatedEvent) throws InterruptedException {
        Thread.sleep(5000L);
        System.out.println("EventListener -> " + registrationCreatedEvent.getSource().toString());
    }
}
