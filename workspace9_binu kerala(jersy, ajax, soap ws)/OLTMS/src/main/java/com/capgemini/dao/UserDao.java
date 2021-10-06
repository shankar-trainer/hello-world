package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.User;
@Repository
public interface UserDao extends JpaRepository<User, Long>{
	@Query("select u.userId from User u where u.email=?1")
	public long getIdByEmail(String email);

}
