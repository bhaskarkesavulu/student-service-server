package com.bhaskar.studentserviceserver.controller;

import com.bhaskar.studentserviceserver.entity.Student;
import com.bhaskar.studentserviceserver.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentServiceImpl service;

    @PostMapping(value = "/save")
    public Student save(@RequestBody Student student){

        return service.save(student);

    }

    @PutMapping(value = "/update")
    public Student update(@RequestBody Student student){

        return service.save(student);

    }
    @GetMapping(value = "/list")
    public List<Student> list(){

        return service.list();

    }
    @GetMapping(value = "/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") int id){
        return service.getStudent(id);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id){

        service.delete(id);
    }
}
