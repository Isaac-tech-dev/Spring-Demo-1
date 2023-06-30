package com.isaac.springdemo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Isaac",
                        "Ayeni",
                        LocalDate.now(),
                        "isaac@gmail.com",
                        28
                ),
                new Student(
                        "Tobi",
                        "Badejo",
                        LocalDate.now(),
                        "tobi@gmail.com",
                        22
                )
        );
    }
}
