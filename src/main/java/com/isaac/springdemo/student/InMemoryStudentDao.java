package com.isaac.springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {

    private List<Student> STUDENTS = new ArrayList<>();

    public Student save(Student s) {
        STUDENTS.add(s);
        return s;
    }


    public List<Student> findAllStudents(){
        return STUDENTS;
    }


    public Student findByEmail(String email) {
        return STUDENTS.stream().filter(s -> email.equals(s.getEmail())).findFirst().orElse(null);
    }


    public void delete(String email) {
        var students = findByEmail(email);
        if (students != null){
            STUDENTS.remove(students);
        }
    }

    public Student update(Student s) {
        var studentIndex = IntStream.range(0, STUDENTS.size()).filter(index -> STUDENTS.get(index).getEmail().equals(s.getEmail())).findFirst().orElse(-1);
        if(studentIndex > -1){
            STUDENTS.set(studentIndex, s);
            return s;
        }
        return null;
    }
}
