package com.example.account;

import lombok.experimental.UtilityClass;

@UtilityClass // utility 클래스의 static 메서드들만 사용할수 있도록 잘 도와준다
public class NumberUtil {

    // class는 껍데기 일 뿐이고, 밑에 static한 메서드들을 만들어놓고 쓸때,
    // 객체를 생성하지 않고 사용할수있다
    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }
    public static Integer minus(Integer a, Integer b) {
        return a - b;
    }

}
