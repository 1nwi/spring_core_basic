package com.spring.core.oop.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hotel {

//    @Autowired
    private final Restaurant restaurant;

    @Autowired // 생성자를 통해 객체를 주입받겠다.
    // @Qualifier : 주입받을 객체를 특정 - 컴포턴트의 이름 (클래스 이름의 카멜케이스)
    public Hotel(@Qualifier("koreanRestaurant") Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    //레스토랑 예약기능
    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();
    }
}
