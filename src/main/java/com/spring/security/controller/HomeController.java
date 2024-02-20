package com.spring.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/home")
    public String helloWorld() {
        log.info("Call API /hello from HomeController class for permit all");
        return "Hello World";
    }

    @GetMapping("/user")
    public String user(Principal principal) {
        log.info("Call API /user from user");
        return "Hello " + principal.getName();
    }

    @GetMapping("/admin")
    public String admin(Principal principal) {
        log.info("Call API /admin from admin");
        return "Hello " + principal.getName();
    }
}
