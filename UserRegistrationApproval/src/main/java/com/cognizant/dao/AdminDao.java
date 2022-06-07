package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Admin;
import com.cognizant.model.User;

public interface AdminDao {
 public List<User>  getUserList();
 public boolean chceckLogin(Admin admin);
}
