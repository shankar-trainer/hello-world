package org.com.dao;

import org.com.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepositories extends JpaRepository<Test, Integer> {
	
}