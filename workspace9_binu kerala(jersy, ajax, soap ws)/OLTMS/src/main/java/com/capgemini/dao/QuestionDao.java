package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
