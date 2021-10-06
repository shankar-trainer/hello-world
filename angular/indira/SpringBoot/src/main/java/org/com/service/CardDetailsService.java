package org.com.service;

import java.util.Optional;

import org.com.dao.CardDetailsDao;
import org.com.model.CardDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CardDetailsService {

	@Autowired
	CardDetailsDao dao;
	
	CardDetails card;
	
	public void addCard(CardDetails card)
	{
		dao.save(card);
	}
	
	public CardDetails searchCard(int cardno) {
		
		Optional<CardDetails> find = dao.findById(cardno);
		System.out.println("finding card --- ");
		
		if (find.isPresent())
		{
		System.out.println("CardNo is found ");
		
		 card = find.get();
		
			return card;
		}
		else
		{
			System.out.println("1. CardNo is not found in database ");
			return null;
		}
		
		
	}
	
	public void showAllCard() 
	{
		dao.findAll().forEach(System.out::println);
	}
	
}
