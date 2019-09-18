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
 * for a chequing account
 * <p>
 * inherited from BankAccount
 * @author hyunjo Suh
 * @version 1.0
 * @since 1.0
 */
public class ChequingAccount extends BankAccount {
	//This class will be inherited from BankAccount and contains the data members for
	//a chequing account (ie double fee)
	
	/**
	 * fee deducted monthly from the balance for a chequing account
	 */
	private double fee;
	
	
	
	

	/**
	 * default constructor
	 * <p>
	 * extends BankAccount
	 */
	public ChequingAccount() {
		super();
	}
	
	
	/**
	 * initial constructor
	 * <p>
	 * extends BankAccount
	 * @param accNum int value of account number of the account
	 * @param inputUser Client value of the account owner
	 * @param balance double value of balance of the account
	 * @param fee double value of the monthly fee deducted from the account
	 */
	public ChequingAccount(int accNum, Person inputUser, double balance, double fee) {
		//initial constructor
		
		super(accNum, inputUser, balance);
		this.fee = fee;
		
	}

	
	
	
	
	
	/**
	 * Returns the data of the account formatted to display
	 * <p>
	 * Overriding toString() from BankAccount class
	 * @return String value of formatted information
	 */
	@Override
	public String toString() {
		
		return super.toString() + " " + String.format("%.2f", fee);
		//formats the fee to 2 decimal places
	}
	
	
	
	
	
	/**
	 * Adds a chequing account if standards are met
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
	 * @return boolean value of whether the chequing account was created successfully or not
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
		
		// prompts the user to enter a valid monthly fee
		validFee:
			while(true) {
				System.out.println("Enter monthly fee:");
				try{
					fee = mFee;
				}
				catch(Exception ex) {
					System.out.println("Please enter a valid interest rate");
					return false;
				}

				if (fee < 0) {
					System.out.println("Error: invalid interest rate.");
					return false;
				}
				break validFee;
			}
			
		return true;	
	}
	
	
	
	/**
	 * Performs the monthly update
	 * <p>
	 * processes the object with monthly update of withdrawing the fee 
	 * (as long as bank balance is more than fee, else displays error message).
	 * Overrides toString() of BankAccount class
	 * @throws Exception the exception
	 */
	@Override
	public void monthlyAccountUpdate() throws Exception{
		
		if (balance > fee) {
			//if enough balance is in the account
			super.updateBalance(fee);
			//withdraws account
		} else {
			throw new Exception("Error: insufficient balance for account #" + accNumber);
		}
	}
}
