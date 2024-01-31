package com.example.customer.customer.feignclient;


import com.example.customer.customer.response.CustomerResponse;
import com.example.customer.customer.response.OrderResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@FeignClient(name="Orders",url ="http://localhost:8081")
public interface OrderClient {

    @GetMapping("/orders/{id}")
    public ResponseEntity<OrderResponse> getOrderCustomerById(@PathVariable("id")int id);
}
