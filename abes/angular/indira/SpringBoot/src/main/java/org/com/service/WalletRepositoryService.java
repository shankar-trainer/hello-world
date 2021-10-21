package org.com.service;

import java.util.Optional;

import org.com.dao.WalletUserDao;
import org.com.model.WalletUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WalletRepositoryService {

	@Autowired
	WalletUserDao dao;
	
	public void addUser(WalletUser user)
	{
		dao.save(user);
	}
	
	public void searchUser(WalletUser user) {
		Optional<WalletUser> find = dao.findById(user.getUserId());
		if (find.isPresent())
			System.out.println("Department Found " + user);
		else
			System.out.println("Department not Found");
	}
	
	public void showAllUser() {
		dao.findAll().forEach(System.out::println);
	}
	
}
