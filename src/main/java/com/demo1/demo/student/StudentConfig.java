package com.demo1.demo.student;

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
            Student mariam = new  Student(
              "Mariam",
              "Mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            Student zeeshan = new  Student(
                    "Zeeshan",
                    "Zeeshan@gmail.com",
                    LocalDate.of(1998, Month.JANUARY,5)
            );

            repository.saveAll(List.of(mariam,zeeshan));
        };
    }
}
