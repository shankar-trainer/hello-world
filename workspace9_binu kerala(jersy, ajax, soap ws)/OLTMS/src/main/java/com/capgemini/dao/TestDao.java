package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Test;
@Repository
public interface TestDao extends JpaRepository<Test, Integer> {

}
