package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student alin = new Student(
                    "Alin",
                    "alin@email.com",
                    LocalDate.of(1988, Month.SEPTEMBER, 22)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@email.com",
                    LocalDate.of(2000, Month.JANUARY, 05)
            );

            repository.saveAll(
                    List.of(alin, alex)
            );

        };
    }
}
