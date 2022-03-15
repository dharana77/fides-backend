package com.fides.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
public class WebController {
    private static final String IS_MOBILE = "MOBI";

    @GetMapping("/")
    public String detectDevice(HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent").toUpperCase();
        if (userAgent.indexOf(IS_MOBILE) > -1) {
            return "mobile/index";
        }
        return "vue/index";
    }
}
