package com.example.demowebapp.service;

import com.example.demowebapp.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    boolean loginStudent(String username, String password);

    void deleteStudents(int id);

    String saveStudent(Student student);
}
