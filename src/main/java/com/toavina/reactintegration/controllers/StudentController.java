package com.toavina.reactintegration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toavina.reactintegration.entities.Student;
import com.toavina.reactintegration.services.StudentService;

@RestController()
@RequestMapping(path = "/api/v1")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Hello ! ", HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        try {
            List<Student> students = studentService.getAllStudents();
            return new ResponseEntity<>(students, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
