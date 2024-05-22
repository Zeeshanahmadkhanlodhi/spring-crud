package com.demo1.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//Responsible for data access
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);
}
