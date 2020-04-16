package com.jjk.shopping.Service.impl;

import com.jjk.shopping.Entity.Student;
import com.jjk.shopping.Repsoity.StudentReposity;
import com.jjk.shopping.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentReposity studentReposity;

    @Override
    public Student findByName(String name) {
        return  studentReposity.findByName(name);
    }
}
