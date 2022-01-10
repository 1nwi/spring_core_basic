package com.spring.core.oop.hotel;

import org.springframework.stereotype.Component;

@Component
public class KoreanRestaurant implements Restaurant{

    private final Chef chef;

    public KoreanRestaurant(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("한식 요리를 주문합니다.");
        chef.cook();
    }
}
