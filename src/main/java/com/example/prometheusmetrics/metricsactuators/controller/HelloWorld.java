package com.example.prometheusmetrics.metricsactuators.controller;


import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/college")
public class HelloWorld {
    private final Counter helloEndpointCounter;

    @Autowired
    public HelloWorld(MeterRegistry meterRegistry) {
        this.helloEndpointCounter = meterRegistry.counter("college.hello.requests");
    }

    @GetMapping("/hello")
    public String sayHello() {
        helloEndpointCounter.increment();

        return "Hello World!";
    }
}
