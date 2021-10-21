package com.capegemini.java8;

public interface CustomerDao {
	  void customerInfo();
}
class CustomerImpl1{
	
	public static void main(String[] args) {
		CustomerDao customerDao=new CustomerDao() {
			@Override
			public void customerInfo() {
				System.out.println("customerInfo");
			}
		};

           customerDao.customerInfo();
	}
}



class CustomerImpl implements CustomerDao{
	@Override
	public void customerInfo() {
	}
	
}