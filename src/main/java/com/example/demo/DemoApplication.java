package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


                                                                var i = new I();
                                                                i.am = "Microservices & Cloud Analyst, specialized in backend";
                                                                i.workWith = new String[]{"Amazon Web Services", "Python", "Java", "Spring boot", "Cloud & Software Architecture"};
                                                                i.love = new String[]{"open-minded people", "computers", "challenges", "learn new things", "friends & family", "animals & nature"};
                                                                i.aspireTo = "change the world for the better";



    }
}


class I {
    String am;
    String[] love;
    String[] workWith;
    String aspireTo;
}

