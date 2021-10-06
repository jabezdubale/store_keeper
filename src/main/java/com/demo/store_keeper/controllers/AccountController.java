package com.demo.store_keeper.controllers;

import com.demo.store_keeper.domains.Employee_Info;
import com.demo.store_keeper.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/api/account/create")
    public Employee_Info createAccounta(@RequestBody Employee_Info account){
        return accountService.createAccountb(account);
    }
}
