package com.bunny.jms.controller;

import com.bunny.jms.service.AnimalQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    @Autowired
    private AnimalQueryService animalQueryService;

    @GetMapping("/rest/animal/query")
    public String query() {
        animalQueryService.sendMessage();
        return "200 OK";
    }
}
