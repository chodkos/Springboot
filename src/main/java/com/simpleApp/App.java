package com.simpleApp;

import com.simpleApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@EnableAutoConfiguration
public class App {

    GreetingService greetingService;








    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
