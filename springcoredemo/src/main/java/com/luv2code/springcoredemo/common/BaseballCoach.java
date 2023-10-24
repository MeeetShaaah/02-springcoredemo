package main.java.com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In Constructor:" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in batting practice";
    }
}
