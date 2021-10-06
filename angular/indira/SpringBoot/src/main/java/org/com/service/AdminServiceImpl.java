package org.com.service;

import java.util.List;
import java.util.Optional;

import org.com.dao.WalletAdminDao;
import org.com.dao.WalletUserDao;
import org.com.model.WalletAdmin;
import org.com.model.WalletUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminServiceImpl")
public class AdminServiceImpl implements AdminService{

	@Autowired
	WalletUserDao userDao;
	
	@Autowired
	WalletAdminDao adminDao;
	
	 public String addAdmin( WalletAdmin walletAdmin) {
			
			Optional <WalletAdmin> findById = adminDao.findById(walletAdmin.getAdminId());
			if(!findById.isPresent())
			{   
				adminDao.save(walletAdmin);
				
				return "admin added";
			}
			return "admin already present";
		}
   
   public List<WalletUser> showRegisteredUsers(){
	   return userDao.getRegisteredAccounts();
   }
   
   public String removeAdminById( int aid) {
		
		Optional <WalletAdmin> findById = adminDao.findById(aid);
		if(findById.isPresent())
		{
			adminDao.deleteById(aid);
			return "admin removed";
		}
		return "admin not present";
		
	}
  
  public String updateAdmin( WalletAdmin walletAdmin) {
		
		Optional <WalletAdmin> findById = adminDao.findById(walletAdmin.getAdminId());
		if(findById.isPresent())
		{
			adminDao.save(walletAdmin);
			return "admin updated";
		}
		return "admin not present";
	}
	
	public WalletAdmin showAdminById(int aid) {
		
		Optional <WalletAdmin> findById = adminDao.findById(aid);
		if(findById.isPresent())
		{
			WalletAdmin admin = findById.get();
			return admin;
		}
		return null;
		
	}

	@Override
	public String updateUser(WalletUser walletUser) {
		
		Optional <WalletUser> findById = userDao.findById(walletUser.getUserId());
		if(findById.isPresent())
		{
			userDao.save(walletUser);
			return "user updated";
		}
		return "user not present";
	}

}
