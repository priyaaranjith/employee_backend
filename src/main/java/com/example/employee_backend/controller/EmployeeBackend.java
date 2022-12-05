package com.example.employee_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeBackend {

    @GetMapping("/")
    public String welcomepage(){
        return "welcome";
    }
    @GetMapping("/add")
    public String addemployee(){
        return "add employee";
    }




}
