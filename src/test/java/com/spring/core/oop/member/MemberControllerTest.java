package com.spring.core.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberControllerTest {

    @Test
    void controllerTest() {
        AppConfig app = new AppConfig();
        MemberController mc = app.memberController();
        mc.join(new Member(1, "김철수", Grade.GOlD));
        OrderController oc = app.orderController();
    }

}