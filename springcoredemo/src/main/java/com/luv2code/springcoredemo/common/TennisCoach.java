package main.java.com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Constructor:" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practive your backhand volley";
    }
}
