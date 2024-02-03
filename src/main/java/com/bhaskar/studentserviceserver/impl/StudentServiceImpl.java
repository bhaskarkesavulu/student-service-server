package com.bhaskar.studentserviceserver.impl;

import com.bhaskar.studentserviceserver.entity.Student;
import com.bhaskar.studentserviceserver.repository.StudentRepository;
import com.bhaskar.studentserviceserver.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> list() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> getStudent(int id) {
        return repository.findById(id);
    }

    @Override
    public void delete(int id) {

        repository.deleteById(id);

    }
}
