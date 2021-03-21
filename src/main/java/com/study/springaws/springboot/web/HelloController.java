package com.study.springaws.springboot.web;
import com.study.springaws.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
* 이 친구가 이 클래스를
* JSON을 반환하는 컨트롤러로 만들어줌
* */
@RestController
public class HelloController
{
    /*
     * Get은 그 HTTP METHOD의 그 GET임.
     * 즉, GET요청을 받아주는 API
     */

    @GetMapping("/hello")
    public String hello(){
        return "hellllloo~";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto HelloDto(@RequestParam("name") String name, @RequestParam("amount") int amount ){
        return new HelloResponseDto(name, amount);
    }
}
