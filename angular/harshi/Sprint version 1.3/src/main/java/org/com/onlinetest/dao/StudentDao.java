package org.com.onlinetest.dao;

import java.math.BigInteger;

import org.com.onlinetest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, BigInteger> {

}
