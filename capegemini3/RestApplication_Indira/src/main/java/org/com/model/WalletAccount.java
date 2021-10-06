package org.com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity

public class WalletAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(name="seq2", sequenceName = "wallet_seq", initialValue=2000)
	@Column(name="AccountId")
	private int AccountId;
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="AccountBalance")
	private double AccountBalance;
	
	// @OneToOne
	// @JoinColumn(name = "UserId")
	// private WalletUser walletUser;
	 

	public int getAccountId() {
		return AccountId;
	}

	public void setAccountId(int accountId) {
		AccountId = accountId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}

	/*public WalletUser getWalletUser() {
		return walletUser;
	}

	public void setWalletUser(WalletUser walletUser) {
		this.walletUser = walletUser;
	}*/

	@Override
	public String toString() {
		return "WalletAccount [AccountId=" + AccountId + ", Status=" + Status + ", AccountBalance=" + AccountBalance
				 + "]";
	}

	

	 
}
