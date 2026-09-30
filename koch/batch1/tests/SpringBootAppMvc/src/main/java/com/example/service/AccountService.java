package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.AccountException;
import com.example.model.Account;
import com.example.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account addAccount(Account account) {
		if (accountRepository.findById(account.getAccountId()).isEmpty())
			return accountRepository.save(account);
		else {
			throw new AccountException("account with given  id already present");
		}
	}

	public Account searchAccount(int id) {
		if (accountRepository.findById(id).isEmpty())
			throw new AccountException("account with   id not present");
		else
			return accountRepository.findById(id).get();
	}

	public List<Account> showAllAccount() {
		if (accountRepository.findAll().isEmpty())
			throw new AccountException("account list is empty");
		else
			return accountRepository.findAll();
	}

	public Account deleteAccount(int id) {
		if (accountRepository.findById(id).isEmpty())
			throw new AccountException("account with given  id is not present");
		else {
			Account a1 = accountRepository.findById(id).get();
			accountRepository.deleteById(id);
			return a1;
		}
	}

	public Account updateAccount(Account act) {
		if (accountRepository.findById(act.getAccountId()).isEmpty())
			throw new AccountException("account with given  id is not present");

		else
			return accountRepository.save(act);
	}

}
