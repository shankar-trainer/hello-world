package com.capg.main;

import java.util.Scanner;

import com.capg.bean.Person;
import com.capg.dao.PersonDao;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    PersonDao dao=new PersonDao();
	    
		String ch="y";
		Person person;
		
		while(ch.equals("y")) {
			System.out.println("1.Add Person");
			System.out.println("2.Show All Person");
			System.out.println("3.Remove Person");
			System.out.println("4.Search Person");
			System.out.println("5.Update Person");
			
			int op=sc.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Enter id name and salary");
				person=new Person();
				person.setPersonId(sc.nextInt());
				sc.nextLine();
				person.setPersonName(sc.nextLine());
				person.setPersonSalary(sc.nextFloat());
				Person p1=dao.addPerson(person);
				if(p1!=null) {
					System.out.println("person added");
				    System.out.println(p1);	
				}
				else
					System.out.println("not added  already present in  database");
				break;
			case 2:
				dao.getAllPerson().forEach(System.out::println);
  break;
			case 3:
				person=null;
				person=new Person();
				System.out.println("Enter id to delete person ");
				person.setPersonId(sc.nextInt());
				Person p3=dao.deletePerson(person);
				if(p3!=null) {
					System.out.println("found and deleted");
				   System.out.println(p3);
				}
				else
					System.out.println("not found");
				break;
			case 4:
				person=null;
				person=new Person();
				System.out.println("Enter id to delete person ");
				person.setPersonId(sc.nextInt());
				
			Person p5=	dao.searchPerson(person);
				if(p5!=null)
					System.out.println("found \n"+p5);
				else 
					System.out.println("not found ");
				break;
				
			case 5:
				System.out.println("Enter id name and salary to be updated");
				person=new Person();
				person.setPersonId(sc.nextInt());
				sc.nextLine();
				person.setPersonName(sc.nextLine());
				person.setPersonSalary(sc.nextFloat());
				Person p7=dao.updatePerson(person);
				if(p7!=null) {
					System.out.println("person updated");
				    System.out.println(p7);	
				}
				else
					System.out.println("not updated not  present in  database");
				break;
			default:
				System.out.println("wrong input choice ");
				break;
			}
			System.out.println("continue y\\n");
		    ch=sc.next();	
		}
		
		sc.close();
	}
}
