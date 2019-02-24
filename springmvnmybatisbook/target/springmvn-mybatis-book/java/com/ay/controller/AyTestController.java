package com.ay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author innjewel
 * Description SpringMVC 测试controller
 */
@Controller
@RequestMapping("/test")
public class AyTestController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }
}
