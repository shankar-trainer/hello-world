package org.com.onlinetest.dao;

import java.math.BigInteger;

import org.com.onlinetest.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends JpaRepository<Test, BigInteger> {
	

}
