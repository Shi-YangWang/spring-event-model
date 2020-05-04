package com.bunny.jms.events;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
@Accessors(chain = true)
public class GenericAnimalEvent extends ApplicationEvent {
    private String title;
    private String content;

    public GenericAnimalEvent(Object source) {
        super(source);
    }
}
