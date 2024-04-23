package com.example.account.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // 설정클래스
public class Account { // java 클래스 처럼 보이지만 account 테이블을 하나 만드는 것이다.
    @Id // PK키
    @GeneratedValue
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING) // enum 값의 숫자코드가 아닌 실제 등록한 문자열을 db에 저장
    private AccountStatus accountStatus;
}
