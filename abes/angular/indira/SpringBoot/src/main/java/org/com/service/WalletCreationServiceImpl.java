package org.com.service;


import java.util.List;
import java.util.Optional;
import org.com.dao.WalletAccountDao;
import org.com.dao.WalletTransactionDao;
import org.com.dao.WalletUserDao;
import org.com.model.WalletAccount;
import org.com.model.WalletTransaction;
import org.com.model.WalletUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("walletCreationServiceImpl")
public class WalletCreationServiceImpl implements WalletCreationService{

	@Autowired
	WalletUserDao userDao;
	
	@Autowired
	 WalletAccountDao accountDao;
	
	@Autowired
	WalletTransactionDao transactDao;
	
	WalletUser user;
	WalletAccount account;
	
    public WalletUser addUser( WalletUser walletUser) {
		
		Optional <WalletUser> findById = userDao.findByAadhaarNo(walletUser.getAadhaarNo());
		if(!findById.isPresent())
		{   
			account=new WalletAccount();
			account.setAccountBalance(0.0f);
			account.setStatus("registered");
			walletUser.setWalletAccount(account);
			account.setWalletUser(walletUser);
			WalletUser user=userDao.save(walletUser);
			
			return user;
		}
		return null;
	}
    
   public String removeUserById( int uid) {
		
		Optional <WalletUser> findById = userDao.findById(uid);
		if(findById.isPresent())
		{
			userDao.deleteById(uid);
			return "user removed";
		}
		return "user not present";
		
	}
   
   public String updateUser( WalletUser walletUser) {
		
		Optional <WalletUser> findById = userDao.findById(walletUser.getUserId());
		if(findById.isPresent())
		{
			userDao.save(walletUser);
			return "user updated";
		}
		return "user not present";
	}
	
	public WalletUser showUserById(int uid) {
		
		Optional <WalletUser> findById = userDao.findById(uid);
		if(findById.isPresent())
		{
			WalletUser user = findById.get();
			return user;
		}
		return null;
		
	}
	
     public boolean validLoginName(String loginName) {
		
		Optional<Integer> findById = userDao.validLoginName(loginName);
		if(findById.isPresent())
		{
			
			return false;
		}
		return true;
		
	}
     
     public Integer validLogin(String loginName, String password) {
 		
 		Optional<Integer> findById = userDao.validLogin(loginName, password);
 		if(findById.isPresent())
 		{
 			Integer id = findById.get();
 			return id;
 		}
 		return null;
 		
 	}
	public double showBalance(int uid) {
	
			return accountDao.getAccountBalance(uid);
		
	}
	
	public List<WalletTransaction> showTransactions(int uid){
		
		return transactDao.getTransaction(uid);
	}
	
}
