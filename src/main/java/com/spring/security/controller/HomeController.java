package com.spring.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/home")
    public String helloWorld() {
        log.info("Call API /hello from HomeController class for permit all");
        return "Hello World";
    }

    @GetMapping("/user")
    public String user() {
        log.info("Call API /hello from user");
        return "Hello User";
    }

    @GetMapping("/admin")
    public String admin() {
        log.info("Call API /hello from admin");
        return "Hello Admin";
    }
}
