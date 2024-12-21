package com.sbank.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("hello")
    public String helloWorld(){
        return "hello world";
    }
}
