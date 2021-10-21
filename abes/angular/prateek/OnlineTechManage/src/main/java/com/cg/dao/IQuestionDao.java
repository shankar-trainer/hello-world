package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Questions;

@Repository
public interface IQuestionDao extends JpaRepository<Questions,String> {
	@Query("delete from Questions q where q.exam.examId=:eid ")
	public void deletByExamId(@Param("eid") int examId);
	

}
