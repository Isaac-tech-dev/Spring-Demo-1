package com.isaac.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {


    Student save(Student s);

    List<Student> findAllStudents();

    Student findByEmail (String email);

    void delete(String email);

    Student update(Student s);
}
