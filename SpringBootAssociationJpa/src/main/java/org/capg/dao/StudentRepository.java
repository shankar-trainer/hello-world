package org.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.capg.model.Student;
@Repository
public interface StudentRepository extends  JpaRepository<Student, Integer>{

}
