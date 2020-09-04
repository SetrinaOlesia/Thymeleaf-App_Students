package com.setrina.thymeleafapp.repositories;

import com.setrina.thymeleafapp.models.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends CrudRepository <Student, Integer> {

}
