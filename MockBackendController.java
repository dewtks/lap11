package com.example.mockbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockBackendController {

    // Mock endpoint to return a simple message
    @GetMapping("/api/hello")
    public String getHello() {
        return "Hello from Mock Java Backend!";
    }

    // Mock endpoint with query parameters
    @GetMapping("/api/greet")
    public String greetUser(@RequestParam String name) {
        return "Hello, " + name + "! Welcome to the mock backend!";
    }

}
