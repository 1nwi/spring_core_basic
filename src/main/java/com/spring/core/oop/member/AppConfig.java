package com.spring.core.oop.member;


//역할: 클라이언트가 필요한 객체를 생성해서 주입해주는 객체
public class AppConfig {

    //회원 저장소 객체를 만드는 기능
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    //회원 컨트롤러를 만드는 기능
    public MemberController memberController() {
        MemberController mc = new MemberController(memberRepository());  //생성자 주입 - 협업에서 가장 선호함
        //mc.memberRepository = memberRepository();   //필드 주입  -  제일 위험한 주입
        return mc;
    }

    //주문 컨트롤러를 만드는 기능
    public OrderController orderController() {
        return new OrderController(memberRepository());
    }
}
