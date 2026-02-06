package com.cts.dao;

import com.cts.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends
        JpaRepository<User, Integer> {
    List<User> findByuserName(String userName);

    @Query("select  u from User u where u.userId=?1 and u.userName=?2")
    List<User> findByuserIdAnduserName(int userId, String userName);

    @Query("select  u from User u  order by  userName")
    List<User> findByuserNameOrderByuserName();

    @Query("select  u from User u  order by  userName desc")
    List<User> findByuserNameOrderByuserNameDesc();

    @Transactional
    @Modifying
    @Query("update User u set  u.userName=?1 where u.userId=?2")
    void updateByIdandName(String name, int id);

    @Transactional
    @Modifying
    @Query("delete from  User u where   u.userName=?1")
    void deleteByName(String name);

}
