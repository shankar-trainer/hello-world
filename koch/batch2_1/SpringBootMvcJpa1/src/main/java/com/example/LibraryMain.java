//package com.example;
//
//import java.util.Scanner;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.example.model.Library;
//import com.example.service.LibraryService;
//
//@SpringBootApplication
//public class LibraryMain implements CommandLineRunner {
//
//	@SpringBootApplication
//	public class LibraryMain implements CommandLineRunner {
//	
//		public static void main(String[] args) {
//			SpringApplication.run(LibraryMain.class, args);
//	
//		}
//	
//		@Autowired
//		LibraryService service;
//	
//		@Override
//		public void run(String... args) throws Exception {
//			String ch = "y";
//			Scanner scanner = new Scanner(System.in);
//	
//			while (ch.equals("y")) {
//				System.out.println("1. Add Employee");
//				System.out.println("2. Show All  Employee");
//				int op = scanner.nextInt();
//	
//				Library library;
//	
//				switch (op) {
//				case 1: {
//					library = null;
//					library = new Library();
//	
//	//				System.out.println("Enter libarary id name and location");
//					System.out.println("Enter libarary name and location");
//	
//	//				library.setLibraryId(scanner.nextInt());
//	//				scanner.nextLine();
//					library.setLibraryName(scanner.nextLine());
//					library.setLibraryLocation(scanner.next());
//					try {
//					Library library2 = service.addLibrary(library);
//	
//					System.out.println("Library object is saved "+library2);
//					}
//					catch(RuntimeException e) {
//						System.out.println(e.getMessage());
//					}
//					break;
//				}
//				case 2:
//				{
//					try {
//					service.getAllLibrary().forEach(a->System.out.println(a.getLibraryId()+"\t"+a.getLibraryName()+"\t"+a.getLibraryLocation()));
//					}
//	
//					catch(RuntimeException e) {
//						System.out.println(e.getMessage());
//					}
//					break;
//				}
//				default:
//					System.out.println("invalid operation");
//				}
//				System.out.println("continue y\\n");
//				ch=scanner.next();
//			}
//	
//		}
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(LibraryMain.class, args);
//
//	}
//
//	@Autowired
//	LibraryService service;
//
//	@Override
//	public void run(String... args) throws Exception {
//		String ch = "y";
//		Scanner scanner = new Scanner(System.in);
//
//		while (ch.equals("y")) {
//			System.out.println("1. Add Employee");
//			System.out.println("2. Show All  Employee");
//			int op = scanner.nextInt();
//
//			Library library;
//
//			switch (op) {
//			case 1: {
//				library = null;
//				library = new Library();
//
////				System.out.println("Enter libarary id name and location");
//				System.out.println("Enter libarary name and location");
//
////				library.setLibraryId(scanner.nextInt());
////				scanner.nextLine();
//				library.setLibraryName(scanner.nextLine());
//				library.setLibraryLocation(scanner.next());
//				try {
//				Library library2 = service.addLibrary(library);
//
//				System.out.println("Library object is saved "+library2);
//				}
//				catch(RuntimeException e) {
//					System.out.println(e.getMessage());
//				}
//				break;
//			}
//			case 2:
//			{
//				try {
//				service.getAllLibrary().forEach(a->System.out.println(a.getLibraryId()+"\t"+a.getLibraryName()+"\t"+a.getLibraryLocation()));
//				}
//
//				catch(RuntimeException e) {
//					System.out.println(e.getMessage());
//				}
//				break;
//			}
//			default:
//				System.out.println("invalid operation");
//			}
//			System.out.println("continue y\\n");
//			ch=scanner.next();
//		}
//
//	}
//}
