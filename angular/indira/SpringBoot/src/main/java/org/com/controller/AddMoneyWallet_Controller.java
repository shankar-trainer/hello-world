package org.com.controller;

import java.util.List;
import java.util.Optional;

import org.com.dao.CardDetailsDao;
import org.com.dao.WalletAccountDao;
import org.com.dao.WalletUserDao;
import org.com.error.RecordNotFoundException;
import org.com.model.CardDetails;
import org.com.model.WalletAccount;
import org.com.model.WalletUser;
import org.com.service.CardDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/wallet")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin
public class AddMoneyWallet_Controller {
	
	@Autowired
	WalletAccountDao accountDao;
	
	@Autowired
	WalletUserDao userDao;
	
	@Autowired
	CardDetailsDao cardDao;
	
	WalletAccount walletAccount;
	
	
	CardDetails cardDetails;
	
	@Autowired
	CardDetailsService cardservice;
	
	@GetMapping("/cardDetails/{cardno}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<CardDetails> findByCardNo(@PathVariable("cardno") int cardno )
	{
		try
		{
		
		if(cardservice.searchCard(cardno)!=null)
		{
			cardDetails=cardservice.searchCard(cardno);
			
		
		return new ResponseEntity<CardDetails>(cardDetails,HttpStatus.OK);
		
		}
		else
		{
		//	System.out.println("2. CardNo is not found in database ");
			
			throw new  RecordNotFoundException(" CardNo is not found in database");
		}
		
		}
		
		catch (RecordNotFoundException e) {
			
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);

			// TODO: handle exception
		}
		
	}
	
	
	@PutMapping("/addMoney/{user_id}/{amount}/{cardno}")
	public String addMoney(@PathVariable("user_id") int user_id , @PathVariable("amount") double amount , @PathVariable("cardno") int cardno )
	{
		
      Optional<WalletUser> findById = userDao.findById(user_id);
		
		if(findById.isPresent())

		{
				CardDetails usercardno;
				
				
			//deducting amount from Card		
			usercardno = cardservice.searchCard(cardno);
			if(amount>usercardno.getAmountAvailable())
			{
				return "Card don't have sufficient balance";
			}
			
			else
			{
			
			double cardBalance = usercardno.getAmountAvailable();
			
			cardBalance = cardBalance - amount;
			
			usercardno.setAmountAvailable(cardBalance);
			
			
			
			// adding money to the wallet		
		  double x =  accountDao.getAccountBalance(user_id);
		  
		  amount = amount + x;
		  
		  accountDao.updateBalance(user_id, amount);
		   
		  return "Balance is added to account";
		  
			}
			
		}
		
		return "Balance is not  added to account because user_id is not found";

	}
	
	//	@PostMapping("/addMoney")
//	public String addMoneyWallet(@RequestBody CardDetails card )
//	{
////
////			if(amount<=0)
////			{
////				throw new NegativeAmountException("Balance should not be zero or negative");
////			}
//	//		else
//			{
//			//	System.out.println("Enter the Card details");
//				
//				if(cardservice.searchCard(card)!=null)
//				{
//					cardDetails=cardservice.searchCard(card);
//					
////					if(amount>cardDetails.getAmountAvailable())
////					{
////						System.out.println("Credit Card does not have enough balance");
////					}
////					else
//					{
//				
//					// deducting amount from Card
//				double cardBalance = cardDetails.getAmountAvailable();
//				
//				cardBalance = cardBalance - card.getAmountAvailable();
//					
//				cardDetails.setAmountAvailable(cardBalance);
//				
//				
//				// adding money to wallet
//		//			double walletBalance = walletAccount.getAccountBalance();
//					
//				//	amount=amount + walletBalance;
//					
//			//		walletAccount.setAccountBalance(amount);
//					}
//					
//				}
//				else
//				{
//					System.out.println("CardNo is not found in database ");
//					
//					cardservice.addCard(cardDetails);
//				}
//				
//				
//				return "Balance is added to the account";
//				
//			}
//			
//	}
//	
	@RequestMapping("/showAll")
    public List<CardDetails> show()
    {

		cardDao.findAll().forEach(System.out::println);
	
		System.out.println("Hello hi bye byee ");
    	return cardDao.findAll();
    }
	
	
	
//	@DeleteMapping("/deleteUserWallet/{id}")
//	public String removeUser(@PathVariable("id") int uid) {
//		
//		Optional <WalletUser> findById = userDao.findById(uid);
//		
//		if(!findById.isPresent())
//		{
//			userDao.deleteById(uid);
//			return "User Wallet is removed";
//		}
//		return "User Wallet is not exist";
//		
//	}
//	
}
