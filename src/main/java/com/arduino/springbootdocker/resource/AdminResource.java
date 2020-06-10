package com.arduino.springbootdocker.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminResource {

    @GetMapping("/health")
    public ResponseEntity healthCheck() {
        return ResponseEntity.ok("OK");
    }
}
