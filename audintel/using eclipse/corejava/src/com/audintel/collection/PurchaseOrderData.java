package com.audintel.collection;

import java.util.Date;

public interface PurchaseOrderData {

	long id[] = { 121212, 212121, 676767, 867866 };
	String nm[] = { "training", "Plumbing", "Electrician", "Construction" };
	double cost[] = { 56000, 80000, 90000, 120000 };
	Date date[] = { new Date(), new Date(2019 - 1900, 10, 22), new Date(2022 - 1900, 11, 29),
			new Date(2017 - 1900, 2, 27) };

}
