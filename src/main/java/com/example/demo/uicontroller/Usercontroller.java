package com.example.demo.uicontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")//https:localhost:8080/users
public class Usercontroller {
    @GetMapping
    public String getUser(){
        return "read";
    }
    @PostMapping
    public String CreateUser(){
        return "create";
    }
    @PutMapping
    public String PutUser(){
        return "update";
    }
    @DeleteMapping
    public String DelUser(){
        return "delete";
    }

}


