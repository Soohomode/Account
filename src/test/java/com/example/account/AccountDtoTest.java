package com.example.account;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AccountDtoTest {
    @Test
    void accountDto() {
        //given
        //when
        //then

        AccountDto accountDto = new AccountDto(
                "계정번호",
                "여름",
                LocalDateTime.now()
        );

        System.out.println(accountDto.getAccountNumber());
        System.out.println(accountDto.toString());

    }
}