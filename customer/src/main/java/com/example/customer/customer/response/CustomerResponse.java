package com.example.customer.customer.response;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class CustomerResponse {
    private int id;
    private String name;
    private String phoneNo;

    @Autowired
    OrderResponse orderResponse;
}
