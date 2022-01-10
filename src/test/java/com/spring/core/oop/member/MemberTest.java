package com.spring.core.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    //테스트 메서드 생성
    @Test
    void lombokTest() {
        Member member = new Member();
        member.setName("홍길동");
        member.setId(1);
        member.setGrade(Grade.VIP);
        String name = member.getName();

        System.out.println(member.toString());
    }

}