package com.setrina.thymeleafapp.services;

import com.setrina.thymeleafapp.models.Student;
import com.setrina.thymeleafapp.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> getOne(Integer id) {
        return studentRepository.findById(id);
    }
 public void  addNew( Student student){
        studentRepository.save(student);
 }
 public  void  update (Student student){
        studentRepository.save(student);
 }
}