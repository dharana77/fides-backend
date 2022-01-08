package com.fides.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {
    @GetMapping("/")
    public String vue(){
        return "vue/index";
    }
}
