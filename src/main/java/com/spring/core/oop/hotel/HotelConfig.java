package com.spring.core.oop.hotel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // 스프링 컨테이너에 설정자클래스로 등록하겠다.
//컨테이너 객체 탐색 범위 설정
@ComponentScan(basePackages = "com.spring.core.oop.hotel")
public class HotelConfig {

}
