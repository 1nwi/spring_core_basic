package com.spring.core.oop.member;

import lombok.NoArgsConstructor;


public class OrderController {

    private MemberRepository memberRepository;

    public OrderController() {
        if (this.memberRepository instanceof MemoryMemberRepository) {
            System.out.println("메모리 회원정보로 주문합니다.");
        } else if (this.memberRepository instanceof DataBaseMemberRepository) {
            System.out.println("디비 회원정보로 주문합니다.");
        }
    }


    public OrderController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
        if (memberRepository instanceof MemoryMemberRepository) {
            System.out.println("메모리 회원정보로 주문합니다.");
        } else if (memberRepository instanceof DataBaseMemberRepository) {
            System.out.println("디비 회원정보로 주문합니다.");
        }
    }


}
