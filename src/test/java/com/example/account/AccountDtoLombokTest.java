package com.example.account;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class AccountDtoLombokTest {
    @Test
    void accountDto() {
        //given
        //when
        //then

        AccountDtoLombok accountDto = new AccountDtoLombok(
                "계정번호",
                "여름",
                LocalDateTime.now()
        );

        System.out.println(accountDto.getAccountNumber());
        System.out.println(accountDto.toString());

    }
}