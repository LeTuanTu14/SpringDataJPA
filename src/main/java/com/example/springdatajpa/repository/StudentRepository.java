package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{
    @Query("select s from Student s")
    List<Student> getAll();

    @Transactional
    @Modifying
    @Query(value = "insert into student(name, email) values(?1,?2)", nativeQuery = true)
    void addStudent(String name, String email);

    @Transactional
    @Modifying
    @Query(value = "update student t set t.name = ?2, t.email =?3 where t.id = ?1", nativeQuery = true)
    void updateStudent(Integer id, String name, String email);

    @Transactional
    @Modifying
    @Query("delete from Student t where t.id = ?1")
    void deleteStudentById(Integer id);
}
