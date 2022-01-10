package com.spring.core.oop.hotel;

import org.springframework.stereotype.Component;

//이 클래스를 스프링 컨테이너에 등록
// 스프링에게 객체생성 제어권을 넘기겠다.
@Component
public class KimChef implements Chef{
    @Override
    public void cook() {
        System.out.println("김쉐프가 요리합니다.");
    }
}
