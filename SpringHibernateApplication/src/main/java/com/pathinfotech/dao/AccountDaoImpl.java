package com.pathinfotech.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pathinfotech.model.Account;

@Repository
public class AccountDaoImpl 
//implements AccountDao 

{
	
	@Autowired
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Transactional
//	@Override
	public boolean addAccount(Account account) {
		Account searchAccount = searchAccount(account.getActId());
		if (searchAccount == null) {
			factory.openSession().save(account);
			return true;
		}

		return false;
	}
	@Transactional
	//@Override
	public boolean updateAccount(Account account) {
		Account searchAccount = searchAccount(account.getActId());
		if (searchAccount != null) {
			factory.openSession().update(account);
			return true;
		}

		return false;
	}
	@Transactional
//	@Override
	public boolean removeAccount(int actid) {
		Account searchAccount = searchAccount(actid);
		if (searchAccount != null) {
			factory.openSession().remove(searchAccount);
			return true;
		}
		return false;
	}

//	@Override
	public Account searchAccount(int actid) {
		return factory.openSession().find(Account.class, actid);
	}

//	@Override
	public List<Account> getAllAccount() {
		return factory.openSession().createQuery("from Account").getResultList();
	}

}
