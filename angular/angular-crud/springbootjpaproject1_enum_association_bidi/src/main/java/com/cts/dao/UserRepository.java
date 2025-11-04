package com.cts.dao;

import com.cts.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;


public interface UserRepository  extends JpaRepository<User,Long> {

    public User findByUserName(String userName);

    public List<User> findByUserDob(LocalDate userDob);
    public User findByUserIdAndUserName(Long userId, String userName);

    @Query("select  u from User u where u.userName=?1")
    public User searchByUserName(String userName);

    @Query("select  u from User u where u.userName=?1 and u.userDob=?2")
    public List<User> searchByUserNameandDob(String userName, LocalDate userDob);



}
