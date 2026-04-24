package com.cts;

import com.cts.dao.CustomerDaoImpl;
import com.cts.dao.CustomerDaoImplService;
import com.cts.dao.Exception_Exception;

public class Client1 {

	public static void main(String[] args) throws Exception_Exception {
		
		CustomerDaoImplService dao=new CustomerDaoImplService();
		CustomerDaoImpl customerDaoImplPort = dao.getCustomerDaoImplPort();
		customerDaoImplPort.getAllCustomer().forEach(a->System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getSalary()));
	}
}
