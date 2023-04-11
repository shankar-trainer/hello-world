package com.audintel.collection;

public interface UserInfo {
	void info(int x);

	void show(String s);

}
class  UserInfoImpl1{
	
	public static void main(String[] args) {
		UserInfo info=new UserInfo() {// anonymous inner class
			
			@Override
			public void show(String s) {
			 System.out.println("i m "+s);	
			}
			
			@Override
			public void info(int x) {
		  System.out.println("my id is "+x);		
			}
		};
		
		//UserInfoImpl1 impl1=new UserInfoImpl1();
		//impl1.info.show("mahendra pratap");
		//impl1.info.info(5656);
		info.show("amredra pratap");
		info.info(56665);
	}
}


class UserInfoImpl implements UserInfo {

	@Override
	public void info(int x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

	}
}