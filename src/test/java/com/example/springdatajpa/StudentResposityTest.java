package com.example.springdatajpa;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentResposityTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void getAll() {
        System.out.println("getAll: " + studentRepository.findAll());
    }

}
