//package com.example;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//import com.example.dao.InsuranceRepository;
//import com.example.model.Insurance;
//import com.example.model.User;
//
//@SpringBootApplication
//public class MainApp implements CommandLineRunner {
//
//	public static void main(String[] args) {
//
//		ConfigurableApplicationContext ctx = SpringApplication.run(MainApp.class, args);
//		// User user = ctx.getBean(User.class);
//
//		// System.out.println(user);
//
//		// InsuranceRepository dao = ctx.getBean(InsuranceRepository.class);
////		
////		Insurance insurance=new Insurance();
////		insurance.setName("jeevan samirdhi");
////		insurance.setDuration(5);
////		insurance.setPayment(25000);
////		
////		Insurance insurance1=new Insurance();
////		insurance1.setName("jeevan komal");
////		insurance1.setDuration(10);
////		insurance1.setPayment(20000);
////
////		dao.save(insurance);
////		dao.save(insurance1);
////		
////		List<Insurance> findAll = dao.findAll();
////		findAll.forEach(a->System.out.println(a));
////		
//
//	}
//
//	@Autowired
//	User user;
//
//	@Autowired
//	InsuranceRepository dao;
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(user);
//
//		Insurance insurance = new Insurance();
//		insurance.setName("jeevan samirdhi");
//		insurance.setDuration(5);
//		insurance.setPayment(25000);
//
//		Insurance insurance1 = new Insurance();
//		insurance1.setName("jeevan komal");
//		insurance1.setDuration(10);
//		insurance1.setPayment(20000);
//
//		dao.save(insurance);
//		dao.save(insurance1);
//
//		List<Insurance> findAll = dao.findAll();
//		findAll.forEach(a -> System.out.println(a));
//	}
//}
