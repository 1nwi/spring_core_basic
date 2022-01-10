package com.spring.core.oop.member;

//책임: 회원정보를 메모리공간에 저장해야 한다.
public class MemoryMemberRepository implements MemberRepository{

    @Override
    public boolean save(Member member) {
        System.out.println("메모리에 " + member + "저장함!");
        return true;
    }
}
