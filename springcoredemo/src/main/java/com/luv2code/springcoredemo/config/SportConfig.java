package main.java.com.luv2code.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.com.luv2code.springcoredemo.common.Coach;
import main.java.com.luv2code.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
