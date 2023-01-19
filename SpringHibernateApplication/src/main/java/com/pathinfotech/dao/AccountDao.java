package com.pathinfotech.dao;

import java.util.List;

import com.pathinfotech.model.Account;

public interface AccountDao {
	
	public boolean addAccount(Account account); 
	public boolean updateAccount(Account account); 
	public boolean removeAccount(int actid); 
	public Account searchAccount(int actid); 
	public List<Account> getAllAccount(); 
	
}
