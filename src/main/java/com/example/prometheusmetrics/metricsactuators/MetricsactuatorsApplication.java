package com.example.prometheusmetrics.metricsactuators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetricsactuatorsApplication {

	public static void main(String[] args) {

		SpringApplication.run(MetricsactuatorsApplication.class, args);
		System.out.print("docker success ");
		System.out.println("hello world!");
	}

}
