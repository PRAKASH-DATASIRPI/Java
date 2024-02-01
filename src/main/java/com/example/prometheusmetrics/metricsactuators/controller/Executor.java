package com.example.prometheusmetrics.metricsactuators.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/college")
@RestController

public class Executor {
    @GetMapping("/college")
    public String createCollege() {
        String success="hello world!";
        return success;
    }
}
