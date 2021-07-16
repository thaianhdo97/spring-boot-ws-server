package com.t1908e.springbootwshost.service;

import com.t1908e.demo1.entity.Student;
import com.t1908e.demo1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Component(value = "studentService")
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @WebMethod
    public boolean save(Student student){
        studentRepository.save(student);
        return true;
    }
}
