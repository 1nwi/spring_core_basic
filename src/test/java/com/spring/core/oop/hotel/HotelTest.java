package com.spring.core.oop.hotel;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void reserveTest() {

//        Hotel hotel = new Hotel(new KoreanRestaurant(new KimChef()));

        ApplicationContext context = new AnnotationConfigApplicationContext(HotelConfig.class);
        Hotel hotel = context.getBean(Hotel.class);
        hotel.reserve();
    }

}