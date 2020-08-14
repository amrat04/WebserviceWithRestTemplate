package com.example.demowebapp.service;

import com.example.demowebapp.entity.Student;
import com.example.demowebapp.jpa.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        List<Student> studentsList = studentRepository.findAll();
        return studentsList;
    }

    @Override
    public boolean loginStudent(String username, String password) {
        // Business logic over here.
        // All the calculations over here.
        // and DB call
        Student student = studentRepository.findByUsernameAndPassword(username, password);

//        Optional<Student> student1 = studentRepository.findById(Long.valueOf(1));


        if(student == null){
            return false;
        }
        return true;
    }

    @Override
    public void deleteStudents(int id) {

        //Student s = studentRepository.findById(Long.valueOf(id));
        Long l = Long.valueOf(id);
        studentRepository.deleteById(l);

    }

    @Override
    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "SUCCESS";
    }
}
