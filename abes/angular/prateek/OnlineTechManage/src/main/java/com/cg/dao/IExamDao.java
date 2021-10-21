package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Exam;

@Repository
public interface IExamDao extends JpaRepository<Exam,Integer> {

}
