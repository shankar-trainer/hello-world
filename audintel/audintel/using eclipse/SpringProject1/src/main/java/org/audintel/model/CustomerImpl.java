package org.audintel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@ToString
@Data
public class CustomerImpl implements Customer {

	private int customerId;
	private String customerName;
	private String customerLocation;

	@Override
	public void customerInfo() {
		System.out.println("Customer Information ");
		System.out.println("id is " + getCustomerId());
		System.out.println("name is " + getCustomerName());
		System.out.println("location is " + getCustomerLocation());
	}

}
