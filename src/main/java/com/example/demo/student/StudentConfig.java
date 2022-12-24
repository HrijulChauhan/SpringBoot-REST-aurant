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
            Student Hrijul = new Student(
                    1L,
                    "Hrijul",
                    "hrijulchauhan@gmail.com",
                    LocalDate.of(2002, Month.JANUARY,04)
            );

            Student Arhaan = new Student(
                    "Arhaan",
                    "arhaanminet@gmail.com",
                    LocalDate.of(2002, Month.JANUARY,04)
            );

            // how to save?
            repository.saveAll(
                    List.of(Hrijul,Arhaan)
            );
        };
    }
}
