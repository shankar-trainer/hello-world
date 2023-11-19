package ex1.loose;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Data;

import javax.annotation.PostConstruct;

//@Component
@Service
@Qualifier("homeAddress")
@Data
public class HomeAddress implements Address {

	private int addrId;
	private String addrCity;
	private int addrPin;

	@PostConstruct
	public void init() {
		System.out.println("home address post construct  called ");
		this.addrId = 78787;
		this.addrCity = "noida";
		this.addrPin = 7667767;
	}

	@Override
	public void addressDetail() {
		System.out.println("\nHome Address " + this);
	}
}