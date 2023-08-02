package com.melo.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @GetMapping("hello")
    public String hello() {
        return "docker got my home " + System.currentTimeMillis();
    }
}
