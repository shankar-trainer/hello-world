package com.cts.controller;

import com.cts.dao.AccountRepository;
import com.cts.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/account")
    public Account addAccount(@RequestBody Account account){
       return accountRepository.save(account);
    }

    @GetMapping("/account")
    public List<Account> getAllAccount(){
        return  accountRepository.findAll();
    }

}
