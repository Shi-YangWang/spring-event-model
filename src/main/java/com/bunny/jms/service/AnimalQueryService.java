package com.bunny.jms.service;

import com.bunny.jms.events.GenericAnimalEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class AnimalQueryService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMessage() {
        this.applicationEventPublisher.publishEvent(
                new GenericAnimalEvent(this)
                        .setContent("It s time to feed your animal.")
                        .setTitle("Tip")
        );
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
