package main.java.com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.luv2code.springcoredemo.common.Coach;

@RestController
public class DemoController {
    // define private field for dependency
    private Coach myCoach;
    private Coach anotherCoach;
    // define Constructor for dependency injection 
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) {
        System.out.println("In Constructor:" + getClass().getSimpleName());
        myCoach = theCoach;
 }

//    // define setter method for dependency injection
//
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing Beans: myCoach == theanotherCoach, " + (myCoach == anotherCoach);
    }
}