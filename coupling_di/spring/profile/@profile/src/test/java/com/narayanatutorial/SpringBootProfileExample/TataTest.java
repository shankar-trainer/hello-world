//package com.narayanatutorial.SpringBootProfileExample;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.narayanatutorial.service.VehicleBrand;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@ActiveProfiles("Tata")
//public class TataTest {
//	
//	@Autowired
//	VehicleBrand vehicleBrand;
//	
//	@Test
//	public void testVahicleName() {
//		String vehicalName=vehicleBrand.getVehiclName();
//		assertThat(vehicalName).contains("Tata");
//	}
//
//}
