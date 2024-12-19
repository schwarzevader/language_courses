package com.example.courses;

import org.springframework.boot.SpringApplication;

public class TestLanguageCoursesApplication {

    public static void main(String[] args) {
        SpringApplication.from(LanguageCoursesApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
