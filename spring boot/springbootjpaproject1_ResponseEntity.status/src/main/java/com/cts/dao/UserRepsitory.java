package com.cts.dao;

import com.cts.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepsitory  extends JpaRepository<User,Long> {

}
