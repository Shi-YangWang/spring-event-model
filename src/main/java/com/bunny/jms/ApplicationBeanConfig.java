package com.bunny.jms;

import com.bunny.jms.listeners.FeedAnimalListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationBeanConfig {

    @Bean
    public FeedAnimalListener getFeedAnimalListener() {
        return new FeedAnimalListener();
    }
}
