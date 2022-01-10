package com.spring.core.oop.member;

//역할: 적당한 회원저장소에 회원데이터를 저장해야 한다.
public interface MemberRepository {

    //회원 저장 기능
    boolean save(Member member);
}
