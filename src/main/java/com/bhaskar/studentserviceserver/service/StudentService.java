package com.bhaskar.studentserviceserver.service;

import com.bhaskar.studentserviceserver.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Student save(Student student);
    public Student update(Student student);
    public List<Student> list();
    public Optional<Student> getStudent(int id);
    public void delete(int id);
}
