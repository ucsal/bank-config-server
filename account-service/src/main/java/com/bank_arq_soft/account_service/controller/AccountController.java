package com.bank_arq_soft.account_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AccountController {

    @Value("${message}")
    private String message;

    @Value("${limit.withdraw}")
    private int limit;

    @GetMapping("/info")
    public String info() {
        return "MSG: " + message + " | Limite: " + limit;
    }

}
