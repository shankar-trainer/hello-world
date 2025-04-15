package com.packt.bestpractices.smell;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.packt.bestpractices.smell.dto.Address;
import com.packt.bestpractices.smell.dto.AddressType;
import com.packt.bestpractices.smell.dto.CheckInRequest;
import com.packt.bestpractices.smell.dto.Encounter;
import com.packt.bestpractices.smell.dto.Guarantor;
import com.packt.bestpractices.smell.dto.GuarantorType;
import com.packt.bestpractices.smell.dto.Person;

@RunWith(MockitoJUnitRunner.class)
public class OverEngineeredEncounterServiceTest {
    EncounterService checkInService;
	CheckInRequest request;
	Encounter encounter;
	Person johnsDad;
	Person johnPeterson;
	@Test
	public void checks_in_patient() throws Exception {
		createCheckInRequestForAPatientWithAGuarantor();
		chekcInaPatient();
		assertResult();
	}

	protected void assertResult() {
		assertNotNull(encounter);
		assertNotNull( encounter.getStartDateTime());
		assertEquals(johnPeterson, encounter.getPatient().getPerson());
	}

	protected void chekcInaPatient() {
		encounter = checkInService.checkIn(request);
	}

	protected void createCheckInRequestForAPatientWithAGuarantor() {
		request = new CheckInRequest();
		request.setCheckInDate(new Date());
		request.setDisease("Vomiting");
		request.setDoctor("Dr. Mike Hussey");

		Guarantor daddy = new Guarantor();
		daddy.setGuarantorType(GuarantorType.Person);
		Address newYorkBayArea = buildAddress("12/e xyz Avenue", "US", "NY",
				"49355", AddressType.Residential);
		johnsDad = buildPerson(newYorkBayArea, "Peterson",
				"dontDisturb@my.org", "Freddy");
		daddy.setPerson(johnsDad);

		Address mavernPhilly = buildAddress("123 Frazer", "US", "PA", "19355",
				AddressType.Residential);
		johnPeterson = buildPerson(mavernPhilly, "Peterson",
				"johnYou12345@gmail.com", "John");

		request.setPerson(johnPeterson);
		
		request.setGuarantor(daddy);
		
		
	}

	protected Person buildPerson(Address newYorkBayArea, String lastName,
			String email, String firstName) {
		Person person = new Person();
		person.addAddrees(newYorkBayArea);
		person.setEmail(email);
		person.setFirstName(firstName);
		person.setLastName(lastName);
		return person;
	}

	protected Address buildAddress(String street, String country, String state,
			String zip, AddressType residential) {
		Address address = new Address();

		address.setAddressType(residential);
		address.setCountry(country);
		address.setState(state);
		address.setZip(zip);
		address.setStreet(street);
		return address;
	}
}
