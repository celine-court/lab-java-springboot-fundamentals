package com.ironhack.SpringBootLab.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")

public class GreetingController {

       //hello - Returns "Hello World!"
    @GetMapping("/hello")
    public String hello() {
        return "hello, world!";
    }

    //hello/{name} - Returns "Hello {name}!" where {name} is a path variable
    @GetMapping("/name")
    public String helloName (@PathVariable(value = "name") String name) {
        return "Hello" + name + "!";
    }

    // /add/{num1}/{num2} - Returns the sum of num1 and num2
    @GetMapping("/add/{num1}/{num2}")
    public int addNumbers(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        int sum = num1 + num2;
        return sum;
        }

    // multiply/{num1}/{num2} - Returns the product of num1 and num2
    @GetMapping("/multiply/{num1}/{num2}")
    public int multiplyNumbers(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        int multiple = num1 * num2;
        return multiple;
    }


}
