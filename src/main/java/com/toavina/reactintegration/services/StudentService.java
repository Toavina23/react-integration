package com.toavina.reactintegration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toavina.reactintegration.entities.Student;
import com.toavina.reactintegration.repositories.StudentRepositories;

@Service
public class StudentService {
    @Autowired
    StudentRepositories studentRepositories;

    public List<Student> getAllStudents() {
        List<Student> students = studentRepositories.findAll();
        return students;
    }

    public Student saveStudent(Student student){
        Student savedStudent = studentRepositories.<Student>save(student);
        return savedStudent;
    }
}
