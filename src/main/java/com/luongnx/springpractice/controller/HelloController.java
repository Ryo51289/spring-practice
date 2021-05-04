package com.luongnx.springpractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/hello/{user}")
    public ResponseEntity<?> hello(@PathVariable String user){
        String msg = "Hello " + user;
        return ResponseEntity.ok(msg);
    }
}
