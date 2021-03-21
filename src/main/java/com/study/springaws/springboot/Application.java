package com.study.springaws.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
SpringBootApplication이 Bean부터 모든 설정과 빈 읽기를 자동으로 함
즉 이 클래스가 모든 어플리케이션의 최상단임
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        // 내장 WAS의 실행
        SpringApplication.run(Application.class, args);
    }
}
