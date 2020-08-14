package com.example.demowebapp.controller;

import com.example.demowebapp.dto.LoginRequest;

import com.example.demowebapp.entity.Student;
import com.example.demowebapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    @ResponseBody
    public String getBaseURL(){

        return "hello world!";
    }

    @GetMapping("/product/{productid}")
    @ResponseBody
    public String exampleWithPathVariable(@PathVariable("productid") int productId){

      //  HttpMethod.GET; -- This is used for fetching the data.
      //  HttpMethod.POST; -- This is used for saving the data into the system/DB
      //  HttpMethod.PUT;  -- This is used for updating the data into the system/DB
      //  HttpMethod.DELETE; -- This is used for deleting the data into the system/DB

        return "This was a test hello world exmaple!"+ productId;
    }

    @GetMapping("/book")
    @ResponseBody
        public String exampleWithRequestParameters(@RequestParam("bookid") int bookId, @RequestParam("bookname") String bookName){

        return "Book ID : "+ bookId + " Bookname : "+bookName;
    }

    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestBody LoginRequest loginRequest){
        System.out.println("Username is : "+ loginRequest.getUsername());
        System.out.println("Password is : "+ loginRequest.getPassword());

        boolean validated = studentService.loginStudent(loginRequest.getUsername(), loginRequest.getPassword());

        return validated;
    }


    @PostMapping("/createstudent")
    @ResponseBody
    public String saveStudent(@RequestBody Student student){

        String response = studentService.saveStudent(student);

        return response;
    }

    @GetMapping("/getstudents")
    @ResponseBody
    public List<Student> getStudents(){

        List<Student> studentList = studentService.getStudents();
        //studentList.get(0).getAddress();
        return studentList;
    }

    @PutMapping("/updatestudent")
    @ResponseBody
    public String testPutService(@RequestBody String Username, String password){
        return "success";
    }


    @DeleteMapping("/deletestudent/{id}")
    @ResponseBody
    public String testdeteleService(@PathVariable("id") int id){
        studentService.deleteStudents(id);
        return "success";
    }

}
