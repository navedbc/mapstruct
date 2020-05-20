package com.sexonbeach.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmpController {

    @GetMapping
    public String getEmp(){
        return "hello";
    }
}
