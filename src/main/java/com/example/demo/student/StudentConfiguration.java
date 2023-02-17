package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args ->  {
            Student mariam = new Student(
                    "mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JULY,21)
            );
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(1997, Month.JULY,21)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
