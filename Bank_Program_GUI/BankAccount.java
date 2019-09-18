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
 * class  will  be  the  base  class  and contain  the  common  data  members 
 * for all  Bank  Accounts (ie  accountNumber,accHolder, balance)
 * @author hyunjo Suh
 * @version 1.0
 * @since 1.0
 */
public abstract class BankAccount extends Bank {
	//Here, accHolder is an object of class Person

	/**
	 * account number in integer format
	 */
	protected int accNumber;
	
	/**
	 * account holder
	 */
	protected Person accHolder;
	
	/**
	 * balance of an account
	 */
	protected double balance;
	


	
	
	
	
	/**
	 * default constructor for bank account
	 * <p>
	 * extends Bank class
	 */
	public BankAccount() {
		
	}
	
	
	
	
	/**
	 * Parameterized constructor for Bank Account
	 * @param accNumber int value of the account number
	 * @param accHolder Client value of the account holder
	 * @param balance double value of the account balance
	 */
	public BankAccount(int accNumber, Person accHolder, double balance) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	
	


	/**
	 * returns the data of the account formatted to display
	 * <p>
	 * Overrides toString() from Object class
	 * @return String value of formatted information
	 */
	@Override
	public String toString() {
		
		String print = accNumber + " " + accHolder.getFirstName()
					+ " " + accHolder.getLastName() + " "+ accHolder.getPhoneNum()
					+ " "+ accHolder.getEmail() + " " + String.format("%.2f", balance);
		return print;
		// returns the formatted info
	}
	
	
	/**
	 * Adds an account if the standards are met
	 * <p>
	 * prompts user to enter data for this object from keyboard 
	 * edits data, and doesn't allow user to continue with bad data
	 * @param accNumber int value of account number
	 * @param fName String value of first name
	 * @param lName String value of last name
	 * @param phoneNum long value of phone number
	 * @param emailAddr String value of email address
	 * @param openingBalance double value of opening balance
	 * @param mFee double value of monthly fee
	 * @param minBalance double value of minimum balance
	 * @param interestRate double value of interest rate
	 * @return boolean value of whether the account was successfully added or not
	 */
	public boolean addBankAccount(int accNumber, String fName,
			String lName, long phoneNum, String emailAddr, double openingBalance, double mFee,
			double minBalance, double interestRate) {		
		
		//prompts the user for valid account number
		checkAccNum:
			while(true) {

				try {
					this.accNumber = accNumber;
				}
				catch (Exception e) {
					
					
					System.out.println("Error: Please enter a valid account number!");
					return false;
				}

				while(accNumber < 0) {
					System.out.println("Error: Please enter a valid account number greater than 0!");
					return false;
				}
				
				break checkAccNum;
			}
	
	
		//prompts the user for valid opening balance
		validBal:
			while(true) {
				try {
					double bal = openingBalance;
				
					if(bal < 0) {
						System.out.println("Error: invalid balance.");
						return false;
					}
					balance = bal;
					
					break validBal;
				} catch (NullPointerException npe) {
					System.out.println("Error: please enter a value.");
					return false;
				} catch (Exception ex) {
					System.out.println("Error: please enter a valid balance.");
					return false;
				}
			}
	
			
		accHolder = new Person(fName, lName, phoneNum, emailAddr);
	
		return true;
	}
	
	
	
	
	
	/**
	 * updates the balance in the object by the parameter amount
	 * @param amount a double value to add to the account's balance
	 */
	public void updateBalance(double amount) {
		
		this.balance += amount;
		//adds the amount to the balance
		
	}
	
	
	
	
	/**
	 * Performs the monthly account update.
	 *
	 * @throws Exception the exception the exception
	 */
	public abstract void monthlyAccountUpdate() throws Exception;
		//processes the object with monthly update (make it abstract for base class)
	
}
