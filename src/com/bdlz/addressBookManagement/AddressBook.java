package com.bdlz.addressBookManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bdlz.addressBookManagement.details.PersonDetails;

public class AddressBook {

	public static List<PersonDetails> personList = new ArrayList<PersonDetails>();
	Scanner sc = new Scanner(System.in);
	
	public void addPersonDetails()
	{
		System.out.println("Enter Person Details");
		System.out.println("Enter FirstName: ");
		String firstName = sc.next();
		System.out.println("Enter lastName: ");
		String lastName = sc.next();
		System.out.println("Enter Address: ");
		String address = sc.next();
		System.out.println("Enter City: ");
		String city = sc.next();
		System.out.println("Enter State: ");
		String state = sc.next();
		System.out.println("Enter Mobile Number: ");
		String mobileNum = sc.next();
		System.out.println("Enter zipCode: ");
		String zipCode = sc.next();
		
		PersonDetails persondetails = new PersonDetails(firstName, lastName, address, city, state, mobileNum, zipCode);
		personList.add(persondetails);
		System.out.println("Person details added");
	}

	public static void main(String[] args) {
		System.out.println("------WELCOME TO ADDRESS BOOK MANAGEMENT------");
		AddressBook addressbook=new AddressBook();
		addressbook.addPersonDetails();
		}
}
