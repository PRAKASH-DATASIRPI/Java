package com.example.customer.customer.configuration;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Bean
    public ModelMapper modelPaper(){
        return new ModelMapper();
    }
}
