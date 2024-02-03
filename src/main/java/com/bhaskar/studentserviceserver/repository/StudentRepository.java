package com.bhaskar.studentserviceserver.repository;

import com.bhaskar.studentserviceserver.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
