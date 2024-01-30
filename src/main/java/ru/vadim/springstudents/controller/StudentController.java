package ru.vadim.springstudents.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vadim.springstudents.model.Student;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")

public class StudentController {
    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Ирина").email("irina@gmail.com").age(25).build(),
                Student.builder().firstName("Алексей").email("alexey@gmail.com").age(40).build(),
                Student.builder().firstName("Алина").email("alina@gmail.com").age(33).build()
        );
    }
}

