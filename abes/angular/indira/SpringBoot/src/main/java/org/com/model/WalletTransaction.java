package org.com.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WalletTransaction")
public class WalletTransaction {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq3")
	//@SequenceGenerator(name="seq3", sequenceName = "transact_seq", initialValue=3000)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TransactionId")
	private int TransactionId;
	
	@Column(name="DateOfTransaction")
	private LocalDateTime dateOfTransaction;
	
	@Column(name="Amount")
	private double Amount;
	
	@Column(name="ReceiverId")
	private int receiverId;
	
	@Column(name="SenderId")
	private int senderId;

	public int getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}

	public LocalDateTime getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(LocalDateTime dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	@Override
	public String toString() {
		return "WalletTransaction [TransactionId=" + TransactionId + ", dateOfTransaction=" + dateOfTransaction
				+ ", Amount=" + Amount + ", receiverId=" + receiverId + ", senderId=" + senderId + "]";
	}
	
	
}
