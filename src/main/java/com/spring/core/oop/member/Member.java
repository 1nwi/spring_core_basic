package com.spring.core.oop.member;

import lombok.*;
import static com.spring.core.oop.member.Grade.*;

//열거체
enum Grade {
    VIP, GOlD, SILVER, COMMON
}

@Setter @Getter @ToString
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든필드 초기화 생성자
public class Member {

    private int id; //회원식별코드
    private String name; //회원명
    private Grade grade; //회원등급


    //자바 빈즈 규약
    //기본생성자, 모든필드 초기화생성자, setter/getter, toString...

}
