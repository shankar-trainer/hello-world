package org.com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "CardDetails")
public class CardDetails {

	@Id
	@Column(name = "CardNo")
	private int CardNo;
	
	@Column(name = "ExpiryMonth")
	private int ExpiryMonth;
	
	@Column(name = "ExpiryYear")
	private int ExpiryYear;
	
	@Column(name = "amountAvailable")
	private double amountAvailable;
	
	@OneToOne(cascade = CascadeType.ALL)

	//@JoinColumn(name = "AccountId")
	//   @JsonManagedReference

	   private WalletAccount walletAccount;

	@Override
	public String toString() {
		return "CardDetails [CardNo=" + CardNo + ", ExpiryMonth=" + ExpiryMonth + "/ExpiryYear=" + ExpiryYear
				+ ", amountAvailable=" + amountAvailable + "]";
	}

	public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public int getExpiryMonth() {
		return ExpiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		ExpiryMonth = expiryMonth;
	}

	public int getExpiryYear() {
		return ExpiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		ExpiryYear = expiryYear;
	}

	public double getAmountAvailable() {
		return amountAvailable;
	}

	public void setAmountAvailable(double amountAvailable) {
		this.amountAvailable = amountAvailable;
	}

	public WalletAccount getWalletAccount() {
		return walletAccount;
	}

	public void setWalletAccount(WalletAccount walletAccount) {
		this.walletAccount = walletAccount;
	}
	
	
}

