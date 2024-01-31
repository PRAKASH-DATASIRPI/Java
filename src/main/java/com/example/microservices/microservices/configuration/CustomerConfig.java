package com.example.microservices.microservices.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {


    @Bean
    public ModelMapper modelMapperBean(){
        return new ModelMapper();
    }
}
