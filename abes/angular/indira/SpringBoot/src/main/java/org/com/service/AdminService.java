package org.com.service;

import java.util.List;

import org.com.model.WalletAdmin;
import org.com.model.WalletUser;
import org.springframework.stereotype.Component;

@Component
public interface AdminService {

	public String addAdmin( WalletAdmin walletAdmin);
	public String updateAdmin( WalletAdmin walletAdmin);
	public List<WalletUser> showRegisteredUsers();
	public String removeAdminById( int aid);
	public WalletAdmin showAdminById(int uid);
	public String updateUser(WalletUser walletUser);
}
