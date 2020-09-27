package com.example.springeventsexmp.service;

import com.example.springeventsexmp.api.User;
import com.example.springeventsexmp.event.RegistrationCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Async
    public void publishRegistrationEvent(User user){
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        applicationEventPublisher.publishEvent(new RegistrationCreatedEvent(user));
    }
}
