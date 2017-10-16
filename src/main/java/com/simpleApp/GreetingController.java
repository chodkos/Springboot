package com.simpleApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @RequestMapping("/")
    @ResponseBody
    String helloWorld(){
        return "Hello World!";
    }

    @RequestMapping("/greet")
    @ResponseBody
    public String greeting(){
        return "Greetings!";
    }



    @RequestMapping("grt")
    @ResponseBody
    String greetUser(@RequestParam(value = "name", defaultValue = "Zbigniew") String name){
        return "Witaj" + name;
    }
}
