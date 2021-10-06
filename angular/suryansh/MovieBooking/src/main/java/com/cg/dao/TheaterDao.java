
package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Theater;
@Repository
public interface TheaterDao extends JpaRepository<Theater, Integer>{

	
}
