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
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {
            Student sahal = new Student(
                    1L,
                    "sahal",
                    "sahal.yousuf10@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));

            Student saib = new Student(
                    "saib",
                    "saib.yousuf10@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5));

            repository.saveAll(List.of(sahal, saib));
        };
    }

    ;
}

