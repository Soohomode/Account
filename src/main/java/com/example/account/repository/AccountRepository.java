package com.example.account.repository;

import com.example.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // interface 로 생성
public interface AccountRepository extends JpaRepository<Account, Long> {
    // Entity 를 h2db에 저장하기위해서는 repository 가 필요하다

}
