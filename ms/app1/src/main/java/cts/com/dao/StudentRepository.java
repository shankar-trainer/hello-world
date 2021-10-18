package cts.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cts.com.model.Student;

@Repository
public interface StudentRepository extends  JpaRepository<Student, Integer> {

}
