package org.com.onlinetest.dao;

import java.math.BigInteger;

import org.com.onlinetest.model.Answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerDao extends JpaRepository<Answer, BigInteger> {

}
