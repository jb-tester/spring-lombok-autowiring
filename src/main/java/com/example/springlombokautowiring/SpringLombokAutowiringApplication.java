package com.example.springlombokautowiring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLombokAutowiringApplication implements CommandLineRunner {

    private final SetterDependencyLombok setterDependencyLombok;
    private final SetterDependencyNoLombok setterDependencyNoLombok;
    private final ConstructorDependencyLombok constructorDependencyLombok;

    public SpringLombokAutowiringApplication(SetterDependencyLombok setterDependencyLombok, SetterDependencyNoLombok setterDependencyNoLombok, ConstructorDependencyLombok constructorDependencyLombok) {
        this.setterDependencyLombok = setterDependencyLombok;
        this.setterDependencyNoLombok = setterDependencyNoLombok;
        this.constructorDependencyLombok = constructorDependencyLombok;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringLombokAutowiringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(setterDependencyNoLombok);
        System.out.println(setterDependencyLombok);
        System.out.println(constructorDependencyLombok);
    }
}
