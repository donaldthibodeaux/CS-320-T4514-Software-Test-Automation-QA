package project1;
//Donald Thibodeaux
//3/15/2022
//CS-320-T4514
//package module3;
import java.util.ArrayList;

//arraylist holds list of contacts
public class ContactService{
public ArrayList<Contact>contactList =new
ArrayList<Contact>();

//display list for error check
public void displayContactList() {
	for(int counter = 0; counter <contactList.size();counter++) {
		System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
		System.out.println("\t First Name: "+ contactList.get(counter).getFirstName());
		System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
		System.out.println("\t  Phone number: " + contactList.get(counter).getNumber());
		
		System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
	}	
	}
	// adds new contact assign new to list
public void addContact(String firstName, String lastName, String number, String address) {
	
	//Create new
	Contact contact = new Contact(firstName, lastName, number, address);
	contactList.add(contact);
}
// if contact id match retuen contact object if no match return default contact object
public Contact getContact(String contactID) {
	Contact contact = new Contact(null,null,null,null);
	for(int counter = 0;counter<contactList.size();counter++) {
	if(contactList.get(counter).getContactID().contentEquals(contactID)) {
		contact = contactList.get(counter);
	}
	}
	return contact;
}
//use contactId to find contact to delete
//if not found report
public void deleteContact(String contactID) {
for(int counter = 0;counter<contactList.size();counter++) {
if(contactList.get(counter).getContactID().equals(contactID)){	
contactList.remove(counter);
break;
}
if(counter == contactList.size()-1) {
System.out.println("Contact ID: "+ contactID +" not found.");

}
}
}
// update first name
public void updateFirstName(String updatedString, String contactID) {
for(int counter = 0;counter < contactList.size();counter++) {
if(contactList.get(counter).getContactID().equals(contactID)) {
contactList.get(counter).setFirstName(updatedString);
break;
}
if(counter == contactList.size()-1) {
System.out.println("Contact ID: " + contactID + "not found.");	
}
}
}
//update last name
public void updateLastName(String updatedString, String contactID) {
for(int counter = 0;counter < contactList.size();counter++) {
if(contactList.get(counter).getContactID().equals(contactID)) {
contactList.get(counter).setLastName(updatedString);
break;
}
if(counter == contactList.size()-1) {
System.out.println("Contact ID: " + contactID + "not found.");
}
}
}
//update phone
public void updateNumber(String updatedString, String contactID) {
for(int counter = 0;counter < contactList.size();counter++) {
if(contactList.get(counter).getContactID().equals(contactID)) {
contactList.get(counter).setNumber(updatedString);
break;
}
if(counter == contactList.size()-1) {
	System.out.println("Contact ID: " + "not found.");
}
}
}
//update address
public void updateAddress(String updatedString, String contactID) {
for(int counter = 0;counter < contactList.size();counter++) {
if (contactList.get(counter).getContactID().equals(contactID)) {
	// not letting me spell address have to spell adress?
contactList.get(counter).setAdress(updatedString);

break;
}
if(counter == contactList.size()-1) {
	System.out.println("Contact ID: " + "not found.");
}
}
}}