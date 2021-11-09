package org.capg.model.onetoone_bi;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

//owning side
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int regId;
	private  String  bankName;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Account account;
	
	@OneToMany
	private Set<BankAddress> set_bankAddress;
	
	
	public Set<BankAddress> getSet_bankAddress() {
		return set_bankAddress;
	}
	public void setSet_bankAddress(Set<BankAddress> set_bankAddress) {
		this.set_bankAddress = set_bankAddress;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

 
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}

}
