package com.example.demowebapp.controller;

import com.example.demowebapp.entity.Student;
import com.example.demowebapp.service.CovidService;
import com.example.demowebapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TestWebController {

    @Autowired
    StudentService studentService;

    @Autowired
    CovidService covidService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        List<Student> studentList = studentService.getStudents();



        model.addAttribute("students", studentList);

        model.addAttribute("coviddata", covidService.getCovidData());

        return "testing1";
    }
}
