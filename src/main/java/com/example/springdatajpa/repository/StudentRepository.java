package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{
    @Query(value = "select * from student", nativeQuery = true)
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
    @Query(value ="delete from student t where t.id = ?1", nativeQuery = true)
    void deleteStudentById(Integer id);
}
