package com.coforge.model;

import lombok.Data;

@Data
public class Order {
	private int orderId;
	private String orderState;
	private int orderPinCode;

}
