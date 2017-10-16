package com.simpleApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @RequestMapping("/greet")
    @ResponseBody
    String greeting(){
        return "Greetings!";
    }

    @RequestMapping("/")
    @ResponseBody
    String helloWorld(){
        return "Hello World!";
    }
}
