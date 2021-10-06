package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Answer;
@Repository
public interface AnswerDao extends JpaRepository<Answer, Integer> {

}
