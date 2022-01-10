package com.spring.core.oop.hotel;

import org.springframework.stereotype.Component;

@Component
public class FrenchRestaurant implements Restaurant{

    private Chef chef;

    public FrenchRestaurant(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("프랑스 요리를 주문합니다.");
        chef.cook();
    }
}
