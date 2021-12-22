package com.cognizant;

public class StudentMain {

	public static void main(String[] args) {
		Student st=new Student();
		st.roll=888787;
		st.name="arvind kumar";
		st.location="delhi";
		
		System.out.println("roll is "+st.roll);
		System.out.println("name is "+st.name);
		
		System.out.println("using method ");
		
		st.studentInfo();
	}
}
