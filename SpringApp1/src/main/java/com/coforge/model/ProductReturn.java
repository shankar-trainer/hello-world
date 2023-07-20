package com.coforge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductReturn {
	private int prductReturnId;
	private String prductReturnDate;
	private String prductReturnLocation;
}
