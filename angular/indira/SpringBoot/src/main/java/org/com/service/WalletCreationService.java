package org.com.service;

import java.util.List;

import org.com.model.WalletTransaction;
import org.com.model.WalletUser;
import org.springframework.stereotype.Component;

@Component
public interface WalletCreationService {

	public WalletUser addUser( WalletUser walletUser);
	public String removeUserById( int uid);
	public String updateUser( WalletUser walletUser);
	public WalletUser showUserById(int uid);
	public double showBalance(int uid);
	public List<WalletTransaction> showTransactions(int uid);
	public boolean validLoginName(String loginName);
	public Integer validLogin(String loginName, String password);
}
