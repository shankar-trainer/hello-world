package org.com.onlinetest.dao;

import java.math.BigInteger;

import org.com.onlinetest.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question, BigInteger> {

}
