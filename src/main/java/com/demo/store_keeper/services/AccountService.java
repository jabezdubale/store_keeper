package com.demo.store_keeper.services;

import com.demo.store_keeper.domains.Employee_Info;
import com.demo.store_keeper.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Employee_Info createAccountb(Employee_Info account){

        return accountRepository.save(account);
    }
}
