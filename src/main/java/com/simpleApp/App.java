package com.simpleApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class);
    }

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
    String greetUser(@RequestParam(value = "name", defaultValue = "Świecie") String name){
        return "Witaj " + name;
    }


}
