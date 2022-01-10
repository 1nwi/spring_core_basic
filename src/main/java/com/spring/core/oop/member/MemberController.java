package com.spring.core.oop.member;

//책임 : 적당한 회원 저장소에 저장 명력을 내려야 한다.
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입 명령 기능
    public void join(Member member) {
        memberRepository.save(member);
    }
}
