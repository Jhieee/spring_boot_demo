package com.example.demo.controller

import com.example.demo.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController() {
    @GetMapping("/ping")
    fun ping(): String {
        return "pong"
    }
    @GetMapping("/users")
    fun users(): String {
        UserService().get()
        return "Hello"
    }
}