package com.setrina.thymeleafapp.controllers;

import com.setrina.thymeleafapp.models.Student;
import com.setrina.thymeleafapp.services.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/getAll")
    public String   getAll(Model model) {
        List<Student> students= studentService.getAll();
        model.addAttribute("students", students);
        return "students";

    }

}
