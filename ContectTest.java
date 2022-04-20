package test;


import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;

import project1.Contact;

public class ContectTest{
	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
	Contact contact = new Contact("FirstName","LastName","PhoneNumbr","Address");
	if(contact.getContactID().length() > 10) {
	fail("Contact ID has more than 10 characters.");
	}
	}
	@Test
	@DisplayName("Contact First Name cannot have more than 10 characters")
	void testContactFirstNameWithMoreThanTenCharacters() {
	Contact contact = new Contact("OllyOllyOxenFree","LastName","PhoneNumbr","Address");
	if(contact.getFirstName().length() > 10) {
	fail("First Name has more than 10 characters.");
	}
	}
	@Test
	@DisplayName("Contact Last Name cannot have more than 10 characters")
	void testContactLastNameWithMoreThenTenCharacters() {
		Contact contact = new Contact("Fristname", "OllyOllyOxenFree","PhoneNumber","Address");
		if(contact.getLastName().length()>10) {
			fail("Last Name haas more than 10 charcters.");
		}
	}
	@Test
	@DisplayName("Contact phone number is exactly 10 characters")
	void testContactNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName","5555555555","Adress");
		if(contact.getNumber().length() !=10) {
			fail("Phone number length does not equal 10.");
		}
	}
	@Test
	@DisplayName("Contact Address is cannot have more than 30 characters")
	void testContactAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("FirstName","LastName","PhoneNumber","123456789 is nine charcters long" + "123456789 is another nine characters long");
		if(contact.getAddress().length() > 30) {
			fail("Address has more than 30 characters.");
		}
	}
	@Test
	@DisplayName("Contact First Name shall not be null.")
	void testContactFirstNameNotNull() {
		Contact contact = new Contact("null","LastName","PhoneNumber","Address");
		assertNotNull(contact.getFirstName(),"First name was null");
		
	}
	@Test
	@DisplayName("Contact Last Name shall not be null.")
	void testContactLastNameNotNull() {
		Contact contact = new Contact("FirstName","null","PhoneNumber","Address");
		assertNotNull(contact.getLastName(),"Last name was null");
}
	@Test
	@DisplayName("Contact Phone Number shall not be null.")
	void testContactPhoneNumberNotNull() {
		Contact contact = new Contact("FirstName","LastName","null","Address");
		assertNotNull(contact.getNumber(),"Phone Number was null");
	}
	@Test
	@DisplayName("Contact Address shall not be null.")
	void testContactAddressNotNull() {
		Contact contact = new Contact("FirstName","LastName","Addres","null");
		assertNotNull(contact.getAddress(),"Address was null");
}
}
	