package com.service.testing.controller;

import com.service.testing.model.Student;
import com.service.testing.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/getStudentList")
    public List<Student> getStudentList() {
        return testService.getStudentList();
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        testService.addStudent(student);
        return "Success addStudent.";
    }

}
