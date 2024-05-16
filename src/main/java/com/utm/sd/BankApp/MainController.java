package com.utm.sd.BankApp;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping
    public void login() {
        System.out.println("Login");
        System.out.println("Login");

    }
}
