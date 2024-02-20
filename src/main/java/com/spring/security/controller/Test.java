package com.spring.security.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = "123456";
        String encryptPassword = passwordEncoder.encode(password);
        System.out.println("Password: " + encryptPassword);
    }
}
