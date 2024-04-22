package com.example.account;

import lombok.*;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString // 객체가 담고 있는 값들을 쉽게 출력할수 있도록 도와주는 lombok 기능
//@NoArgsConstructor // 아무것도 없는 생성자를 만들어주는 lombok 기능
@AllArgsConstructor // 모든 속성을 다갖고있는 생성자를 만들어주는 lombok 기능
@RequiredArgsConstructor // 필수값들을 받는 생성자를 만들어주는 lombok 기능
/*
    RequiredArgsConstructor 는 스프링에서 bean들을
    주입받는 생성자 방식으로 만들어준다
* */
//@Data // Getter, Setter, ToString, RequiredArgsConstructor 다 갖고있다
/*
    허나 Data 는 실무에서 주의해서 쓴다, 예를 들어 담고있는 정보중에
    중요한정보(계좌번호, 이름, 전화번호 등) 이 객체에 담길수있기 때문에
    또한 equals 를 오버라이드 하고 있기에 원치 않은 equals 를 해버릴수있기에
 */
@Slf4j
public class AccountDto {
    private String accountNumber;
    private String nickname;
    private LocalDateTime registeredAt;

    public void log() {
        log.error("error is occurred.");
        // Slf4j 는 log를 사용 가능하게 해준다
        // 그렇지 않으면 귀찮은 코드를 상단에 항상 입력해야한다
    }
}
