package com.example.account.controller;

import com.example.account.domain.Account;
import com.example.account.service.AccountService;
import com.example.account.service.RedisTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // 이 컨트롤러가 bean 으로 등록하게 해달라고 spring 에게 알려줌
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    // 컨트롤러에서는 서비스만 의존하도록 한다 repository 에 접속하지 않고
    private final RedisTestService redisTestService;

    @GetMapping("/get-lock")
    public String getLock() {
        return redisTestService.getLock();
    }

    @GetMapping("/create-account") // api
    public String createAccount() {
        accountService.createAccount();
        return "성공!";
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

}
