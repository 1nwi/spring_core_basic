package com.spring.core.oop.member;

//책임: 회원정보를 디비에 저장해야 한다.
public class DataBaseMemberRepository implements MemberRepository{
    @Override
    public boolean save(Member member) {
        System.out.println("디비에 " + member + "저장함!");
        return true;
    }
}
