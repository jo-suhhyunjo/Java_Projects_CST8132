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
 * The purpose of this class is to create and store the data members 
 * for a savings account
 * <p>
 * inherited from BankAccount
 * @author hyunjo Suh
 * @version 1.0
 * @since 1.0
 */
public class SavingsAccount extends BankAccount {
	//ss will be inherited from BankAccount and  
	//contains the data members for a savings account
	// (ie double interestRate, double minimumBalance)

	/**
	 * minimum balance for the savings account
	 */
	private double minBalance;
	
	/**
	 * monthly interest rate for the savings account
	 * <p>
	 * if balance in savings account is greater or equal to the minimum balance, 
	 * the interest is added to the balance
	 */
	private double interestRate;

	
	
	
	/**
	 * default constructor
	 * <p>
	 * extends BankAccount
	 */
	public SavingsAccount() {
		super();
	}
	
	

	/**
	 * initial constructor
	 * <p>
	 * extends BankAccount
	 * @param accNum int value of the account number of the account
	 * @param inputUser Client value of the account owner
	 * @param balance double value of the balance of the account
	 * @param minBal double value of the minimum balance of the account
	 * @param interestRate double value of the interest rate of the account
	 */
	public SavingsAccount(int accNum, Person inputUser, double balance, double minBal, double interestRate) {
		//initial constructor
		super(accNum, inputUser, balance);
		minBalance = minBal;
		this.interestRate = interestRate;
	}
	
	
	
	
	
	/**
	 * Returns the data of the account formatted to display
	 * <p>
	 * Overrides toString() from BankAccount class
	 * @return String value of formatted information
	 */
	@Override
	public String toString(){
		
		return super.toString() + " " + String.format("%.2f", interestRate) + " " + String.format("%.2f", minBalance);
	}
	
	
	/**
	 * Adds a savings account if the standards are met
	 * <p>
	 * prompts user to enter data for this object from keyboard edits data, and doesn't allow user to continue with bad data
	 * @param accNumber int value of account number
	 * @param fName String value of first name
	 * @param lName String value of last name
	 * @param phoneNum long value of phone number
	 * @param emailAddr String value of email address
	 * @param openingBalance double value of opening balance
	 * @param mFee double value of monthly fee
	 * @param minBalance double value of minimum balance
	 * @param interestRate double value of interest rate
	 * @return boolean value of whether the savings account was successfully created or not
	 */
	@Override
	public boolean addBankAccount(int accNumber, String fName,
			String lName, long phoneNum, String emailAddr, double openingBalance, double mFee,
			double minBalance, double interestRate) {

		if (!super.addBankAccount(accNumber, fName,
			 lName, phoneNum, emailAddr, openingBalance, mFee,
			 minBalance, interestRate)) {
			return false;
			// if the super method returned false, return false
		}
		
		//prompts the user for valid minimum balance and stores the value
		validMinBal:
			while(true) {
				try {
					this.minBalance = minBalance;
					
					if (this.minBalance < 0) {
						//if minimum balance is less than zero
						System.out.println("Error: invalid minimum balance.");
						return false;
					}
					break validMinBal;
				} catch (Exception ex) {
					System.out.println("Error: invalid minimum balance.");
					return false;
				}
			}
		
		// prompts the user for valid interest rate and stores the value
		validIntRate:
			while(true) {
				try{
					this.interestRate = interestRate;
				}
				catch(Exception ex) {
					System.out.println("Please enter a valid interest rate");
					return false;
				}

				if (this.interestRate <= 0 || this.interestRate >= 1) {
					//interest should be a number between 0 and 1
					System.out.println("Error: invalid interest rate.");
					return false;
				}
				break validIntRate;
			}
		
		return true;
	}
	
	/**
	 * Performs the monthly update
	 * <p>
	 * processes the object with monthly update of adding interest 
	 * (as long as bank balance is more than minBalance, else displays error message).
	 * Overrides toString() of BankAccount class
	 * @throws Exception the exception
	 */
	@Override
	public void monthlyAccountUpdate() throws Exception{

		if (balance > minBalance) {
			super.updateBalance(balance*(interestRate/12/100));
		} else {

			throw new Exception("Error: insufficient balance for account #" + accNumber);
		}
	}
}
