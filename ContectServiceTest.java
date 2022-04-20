package test;
package package1;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;

import project1.ContactService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Order;


//@TestMethodOrder(OrderAnnotation.class)
class ContactServiceTest {

	@Test
	@DisplayName("Test to Update First Name.")
	//@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.updateFirstName("Sven","0");
		service.displayContactList();
		assertEquals("Sven",service.getContact("0").getFirstName(),"first name was not updated");
		
	
	}
	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.updateLastName("Shirley","2");
		service.displayContactList();
		assertEquals("Shirley",service.getContact("2").getLastName(), "Last name was not updated.");
	}
	
@Test
@DisplayName("Test to update phone number.")
@Order(3)
void testUpdateNumber() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross"," 5555551111", "123 Lollypop Lane");
service.updateNumber("5555550001", "4");
service.displayContactList();
assertEquals("5555550001",service.getContact("4").getNumber(), "Phone number was not updated.");
}
@Test
@DisplayName("Test to update Address.")
@Order(4)
void testUpdateAddress() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross"," 5555551111", "123 Lollypop Lane");
service.updateAddress("555 Nowhere Ave", "6");
service.displayContactList();
assertEquals("555 Nowhere Ave",service.getContact("6").getAddress(),"Address was not updated.");
}
@Test
@DisplayName("Test to ensure service deletes contacts.")
@Order(5)
void testDeleteContact() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross"," 5555551111", "123 Lollypop Lane");
service.deleteContact("8");
ArrayList<Contact>contactListEmpty = new ArrayList<Contact>();
service.displayContactList();
assertEquals(service.contactList,contactListEmpty,"The contact was not deleted.");
}
@Test
@DisplayName("Test to ensure service can add contact.")
@Order(6)
void testAddContact() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross"," 5555551111", "123 Lollypop Lane");


service.displayContactList();
assertNotNull(service.getContact("9"),"Contact was not added correctly.");
}}