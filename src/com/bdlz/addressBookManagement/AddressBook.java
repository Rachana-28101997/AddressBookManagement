package com.bdlz.addressBookManagement;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.bdlz.addressBookManagement.details.PersonDetails;

public class AddressBook {

	public static List<PersonDetails> personList = new ArrayList<PersonDetails>();
	static Scanner sc = new Scanner(System.in);
	static int choice = 0;

	public void addPersonDetails() {
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

	private void editPersonDetails() {
		if (personList.isEmpty()) {
			System.out.println("There are no contacts to print");
		} else {
			String address, city, state, mobileNum, zipCode;
			int id;
			for (PersonDetails addressbook : personList) {
				System.out.println("ID " + personList.indexOf(addressbook) + ":\n" + addressbook);
			}
			System.out.println("Enter ID of contact to edit: ");
			id = sc.nextInt();
			System.out.println(personList.get(id));
			System.out.println(
					"Please select the option to edit\n1.Address\n2.City\n3.State\n4.zipCode\n5.Mobile Number");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Address: ");
				address = sc.next();
				personList.get(id).setAddress(address);
				break;
			case 2:
				System.out.println("Enter City: ");
				city = sc.next();
				personList.get(id).setCity(city);
				break;
			case 3:
				System.out.println("Enter State: ");
				state = sc.next();
				personList.get(id).setState(state);
				break;
			case 4:
				System.out.println("Enter Zip Code: ");
				zipCode = sc.next();
				personList.get(id).setZipCode(zipCode);
				break;
			case 5:
				System.out.println("Enter Mobile Number: ");
				mobileNum = sc.next();
				personList.get(id).setMobileNum(mobileNum);
				break;
			default:
				System.out.println("Error!! Choose correct Option");
				editPersonDetails();
			}
		}
	}

	private void printPersonDetails() {
		if (personList.isEmpty()) {
			System.out.println("There are no details to print");
		} else {
			for (PersonDetails addressbook : personList) {
				System.out.println(addressbook);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("------WELCOME TO ADDRESS BOOK MANAGEMENT------");
		AddressBook addressbook = new AddressBook();

		while (choice <= 5) {
			System.out.println("1.Add Person\n2.Edit Person Details\n3.Print Person Details\n4.To EXIT");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressbook.addPersonDetails();
				break;
			case 2:
				addressbook.editPersonDetails();
				break;
			case 3:
				addressbook.printPersonDetails();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Enter Valid choice");

			}
		}
	}
}
