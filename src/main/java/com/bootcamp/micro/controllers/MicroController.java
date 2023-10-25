package com.bootcamp.micro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MicroController {
    @GetMapping("/bootcamp")
    public String getBootcamp(){
        return "Bootcamp DevOps";
    }
}
