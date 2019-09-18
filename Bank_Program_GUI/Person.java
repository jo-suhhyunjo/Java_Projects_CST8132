package application;

/*
 * Name: Hyunjo Suh
 * Student ID: 040885566
 * Course & Section: CST8132 313
 * Assignment: Lab 9
 * Date: April 18, 2018
 * Purpose: Performs bank program.
 */


/**
 * The purpose of this class is to store and display account holder 
 * information
 * @author hyunjo Suh
 * @version 1.0
 * @since 1.0
 */
public class Person {
	//This class will contain common data members for a person
	//firstName, lastName, phoneNumber, emailAddress
	
	/**
	 * First name of the account holder
	 */
	protected String firstName;
	
	/**
	 * Last name of the account holder
	 */
	protected String lastName;
	
	/**
	 * Phone number of the account holder
	 */
	protected long phoneNum;
	
	/**
	 * Email of the account holder
	 */
	protected String email;
	

	
	/**
	 * constructor which creates a Person Object
	 * <p>
	 * prompts the user for first name, last name, phone number and email and creates a Person Object using the valid values
	 * @param fName String value of first name
	 * @param lName String value of last name
	 * @param phoneNum long value of phone number
	 * @param emailAddr String value of email address
	 */
	public Person(String fName, String lName, long phoneNum, String emailAddr){
		//constructor to create accHolder object
		
		// prompts the user for the first and last name and stores the value
		validName:
			while(true) {
				try {
					firstName = fName;

					lastName = lName;
					

					break validName;
					
				} catch (Exception ex) {
					System.out.println("Error: please enter a valid name");
					continue validName;
				}
			}	
		
		// prompts the user for phone number and stores the value
		validPhone:
			while(true) {
				try {
					this.phoneNum = phoneNum;
					break validPhone;
				} catch (Exception ex) {
					System.out.println("Error: please enter a valid phone number");
					continue validPhone;
				}
			}
		
		// prompts the user for email address and stores the value
		validEmail:
			while(true) {
				try {			

					email = emailAddr;
					break validEmail;
				} catch (Exception ex) {
					continue validEmail;
				}
			}
	
	}

	/**
	 * returns the value of the account holder's first name
	 * @return String value of first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	
	/**
	 * returns the value of the account holder's last name
	 * @return String value of last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	
	/**
	 * returns the value of the account holder's phone number
	 * @return long value of phone number
	 */
	public long getPhoneNum() {
		return phoneNum;
	}
	
	
	/**
	 * returns the value of the account holder's email address
	 * @return String value of email address
	 */
	public String getEmail() {
		return email;
	}
}
