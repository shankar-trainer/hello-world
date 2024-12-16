package com.spring.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onetomany.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
