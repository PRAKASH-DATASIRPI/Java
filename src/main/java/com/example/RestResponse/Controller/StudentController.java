package com.example.RestResponse.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/student")


public class StudentController {

    @GetMapping("/success")
    public ResponseEntity<String> success() {

        return new ResponseEntity<>("Operation successful!", HttpStatus.OK);
    }

    @GetMapping("/not_found")
    public ResponseEntity<String> notFound() {
        return new ResponseEntity<>("Resource not found", HttpStatus.NOT_FOUND);
    }

    @PostMapping("/created")
    public ResponseEntity<String> created(@RequestBody String requestPayload) {

        return new ResponseEntity<>("Resource created successfully", HttpStatus.CREATED);
    }

    @PutMapping("/updated")
    public ResponseEntity<String> updated(@RequestBody String requestPayload) {

        return new ResponseEntity<>("Resource updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/deleted")
    public ResponseEntity<String> deleted() {

        return new ResponseEntity<>("Resource deleted successfully", HttpStatus.NO_CONTENT);
    }

    @GetMapping("/servererror")
    public ResponseEntity<String> serverError() {

        return new ResponseEntity<>("Internal Server Error",HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/search")
    public String searchUsers (@RequestParam("name")String name){

        return name;
    }

    @GetMapping("/request_header")
    public String handleCustomHeader(
            @RequestHeader("User-Agent") String customHeaderValue) {

        return "Value of Custom-Header: " + customHeaderValue;
    }

}

