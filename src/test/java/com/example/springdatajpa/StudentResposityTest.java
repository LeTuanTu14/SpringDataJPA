package com.example.springdatajpa;

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
        System.out.println("getAll: " + studentRepository.getAll());
    }

    @Test
    public void add() {
        studentRepository.addStudent("Tuan Tu", "abc@gmail.com");
    }

    @Test
    public void update() {
        studentRepository.updateStudent(1,"Tuan Tu 14", "tu@gmail.com");
    }

    @Test

    public void delete() {
        studentRepository.deleteStudentById(1);
    }
}
