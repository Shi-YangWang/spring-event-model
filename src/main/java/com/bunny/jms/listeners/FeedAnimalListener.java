package com.bunny.jms.listeners;

import com.bunny.jms.events.GenericAnimalEvent;
import org.springframework.context.event.EventListener;

public class FeedAnimalListener {
    @EventListener
    public void handleEvent(GenericAnimalEvent genericAnimalEvent) {
        System.out.println(genericAnimalEvent.getSource());
        System.out.println("Feed animal done.");
    }
}
