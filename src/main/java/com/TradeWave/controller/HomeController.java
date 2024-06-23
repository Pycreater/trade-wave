package com.TradeWave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String home() {
        return "welcome to Trade - Wave";
    }

    @GetMapping("/hello")
    public String home1() {
        return "welcome to Trade - Wave";
    }
}
