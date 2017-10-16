package com.simpleApp.service;



public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "Witaj" + name;
    }
}
