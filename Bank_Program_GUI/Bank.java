package application;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/*
 * Name: Hyunjo Suh
 * Student ID: 040885566
 * Course & Section: CST8132 313
 * Assignment: Lab 9
 * Date: April 18, 2018
 * Purpose: Performs bank program.
 */


/**
 * The purpose of this class is to contain the array of BankAccount objects and to contain the BankFrame contents for javafx.
 * @author hyunjo Suh
 * @version 1.0
 * @since 1.8
 */
public class Bank {
	// This class will contain the array of BankAccount objects (which are instantiated
	// with either SavingAccount or ChequingAccount objects)

	/** label for minimum balance */
	@FXML
	private Label minBalLabel;

	/** label for opening balance*/
	@FXML
	private Label obLabel;

	/** text field for email */
	@FXML
	private TextField emailField;

	/** grid pane for updating */
	@FXML
	private GridPane updatePane;
	
	/** text field for account number */
	@FXML
	private TextField accNumBox;
	
	/** label for adding */
	@FXML
	private Label addLabel;

	/** label for phone number */
	@FXML
	private Label phoneNumLabel2;

	/** label for phone number */
	@FXML
	private Label phoneLabel;

	/** radio button for the menu item 1 */
	@FXML
	private RadioButton menuItem1;

	/** label for update */
	@FXML
	private Label updateLabel;

	/** label for account number */
	@FXML
	private Label accNumLabel;

	/** grid pane for adding */
	@FXML
	private GridPane addPane;

	/** label for account type */
	@FXML
	private Label accTypeLabel;

	/** text field for monthly fee */
	@FXML
	private TextField mFeeField2;

	/** button for display */
	@FXML
	private Button displayButton;

	/** radio button for the menu item 3 */
	@FXML
	private RadioButton menuItem3;

	/** radio button for the menu item 2 */
	@FXML
	private RadioButton menuItem2;

	/** radio button for the menu item 5 */
	@FXML
	private RadioButton menuItem5;

	/** radio button for the menu item 4 */
	@FXML
	private RadioButton menuItem4;

	/** label for monthly fee */
	@FXML
	private Label mFeeLabel2;

	/** radio button for the menu item 7 */
	@FXML
	private RadioButton menuItem7;

	/** radio button for the menu item 6 */
	@FXML
	private RadioButton menuItem6;

	/** Toggle button for deposit */
	@FXML
	private ToggleButton depositButton;

	/** button for pressing for the menu item */
	@FXML
	private Button nextButton;

	/** text field for last name */
	@FXML
	private TextField lNameField;

	/** label for account type */
	@FXML
	private Label accTypeLabel2;

	/** text field for first name */
	@FXML
	private TextField fNameField;

	/** textField for minimum balance */
	@FXML
	private TextField minBalField2;

	/** label for minimum balance */
	@FXML
	private Label minBalLabel2;

	/** label for interest rate */
	@FXML
	private Label intRateLabel2;

	/** text field interest rate */
	@FXML
	private TextField intRateField2;

	/** toggle button for chequing button */
	@FXML
	private ToggleButton cqButton;

	/** anchor pane for the main pane */
	@FXML
	private AnchorPane mainPane;

	/** label for email */
	@FXML
	private Label emailLabel;

	/** text field for email address */
	@FXML
	private TextField emailAddrField2;

	/** text field for account number */
	@FXML
	private TextField accNumField2;

	/** label for amount */
	@FXML
	private Label amountLabel;

	/** label for account number */
	@FXML
	private Label accNumLabel3;

	/** button for quiting the program */
	@FXML
	private Button quitProgramButton;

	/** label for account number */
	@FXML
	private Label accNumberLabel2;

	/** button for going back to menu */
	@FXML
	private Button toMenuButton;

	/** label for fee */
	@FXML
	private Label feeLabel;

	/** text field for account type */
	@FXML
	private TextField accTypeField2;

	/** label for name */
	@FXML
	private Label nameLabel2;

	/** label for first name */
	@FXML
	private Label fNameLabel;

	/** text field for phone number */
	@FXML
	private TextField phoneField;

	/** toggle group for chequing or savings button */
	@FXML
	private ToggleGroup cOrSgroup;

	/** label for interest rate */
	@FXML
	private Label interestLabel;

	/** text field for interest */
	@FXML
	private TextField interestField;

	/** label for printing accounts */
	@FXML
	private Label printLabel2;

	/** text field for minimum balance */
	@FXML
	private TextField minBalField;

	/** grid pane for printing accounts */
	@FXML
	private GridPane printPane;

	/** button for creating account */
	@FXML
	private Button createButton;

	/** button for updating account */
	@FXML
	private Button updateButton;

	/** toggle button for withdrawing */
	@FXML
	private ToggleButton withdrawButton;

	/** toggle group for deposit or withdraw button */
	@FXML
	private ToggleGroup dOrWGroup;

	/** toggle group for grouping button */
	@FXML
	private ToggleGroup groupButton;

	/** label for displaying */
	@FXML
	private Label displayLabel;

	/** label for email address */
	@FXML
	private Label emailLabel2;

	/** grid pane for menu */
	@FXML
	private GridPane menuPane;

	/** text field for monthly fee */
	@FXML
	private TextField feeField;

	/** grid pane for displaying accounts */
	@FXML
	private GridPane displayPane;

	/** text field for balance */
	@FXML
	private TextField balField2;

	/** text area for printing all accounts */
	@FXML
	private TextArea printTextArea;
	
	/** text field for phone number */
	@FXML
	private TextField phoneNumField2;

	/** button to go back to main menu */
	@FXML
	private Button doneButton;

	/** text field for amount */
	@FXML
	private TextField amountField;

	/** text field for account number */
	@FXML
	private TextField accountNumField;

	/** label for options */
	@FXML
	private Label optionLabel;

	/** button for going back to menu */
	@FXML
	private Button toMenuButton3;

	/** button for going back to menu */
	@FXML
	private Button toMenuButton2;

	/** label for balance */
	@FXML
	private Label balanceLabel2;

	/** label for select modes */
	@FXML
	private Label selectModeLabel;

	/** toggle button for savings account */
	@FXML
	private ToggleButton svButton;

	/** label for last name */
	@FXML
	private Label lNameLabel;

	/** text field for opeing balance */
	@FXML
	private TextField obField;

	/** text field for name */
	@FXML
	private TextField nameField2;

    @FXML
    Alert alert = new Alert(AlertType.INFORMATION);
    
    /** This method clears all text fields in the bankFrame */
    @FXML
    private void clearAllTextField() {
    	accNumBox.setText(null);
    	fNameField.setText(null);
    	lNameField.setText(null);
    	phoneField.setText(null);
    	emailField.setText(null);
    	obField.setText(null);
    	accountNumField.setText(null);
    	nameField2.setText(null);
    	interestField.setText(null);
    	mFeeField2.setText(null);
    	feeField.setText(null);
    	intRateField2.setText(null);
    	emailAddrField2.setText(null);
    	balField2.setText(null);
    	minBalField.setText(null);
    	minBalField2.setText(null);
    	accTypeField2.setText(null);
    	phoneNumField2.setText(null);
    	accNumField2.setText(null);
    	amountField.setText(null);
    	printTextArea.setText(null);
    	
    }
    
    
    
    
    /** This method quits and closes the bankFrame program
     * 
     * @param event ActionEvent quit program button pressed
     */
    @FXML
    void quitProgramButtonPressed(ActionEvent event) {
    	try {    		
    		Stage stage = (Stage) quitProgramButton.getScene().getWindow();
    	    // do what you have to do
    	    stage.close();

    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error closing the program");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    
    /**
     * This method runs the main menu program by reading the selected option
     * @param event next button is pressed
     * @throws Exception the exception the exception
     */
    @FXML
    void nextButtonPressed(ActionEvent event) throws Exception{
    	try {
    		if (menuItem1.isSelected()) {
				menuPane.setVisible(false);
				addPane.setVisible(true);
			} else if (menuItem2.isSelected()) {
				if (!(numAccounts == 0)) {
					menuPane.setVisible(false);
					displayPane.setVisible(true);
				} else {
					alert.setTitle("Error");
				    alert.setHeaderText(null);
				    alert.setContentText("No bank accounts to display.");
				    alert.showAndWait();
				}
			} else if (menuItem3.isSelected()) {
				if (numAccounts > 0) {
					menuPane.setVisible(false);
					updatePane.setVisible(true);
				} else {
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("No bank accounts available to run updates.");
					alert.showAndWait();
				}
			} else if (menuItem4.isSelected()) {
				try {
					if (numAccounts > 0) {
						monthlyUpdate();
						alert.setTitle("Information Dialogue");
						alert.setHeaderText(null);
						alert.setContentText("Monthly update successful.");
						alert.showAndWait();
					} else {
						alert.setTitle("Error");
						alert.setHeaderText(null);
						alert.setContentText("No bank accounts available to run monthly updates.");
						alert.showAndWait();
					}
				
				} catch (Exception exception) {
					alert.setTitle("Error");
				    alert.setHeaderText(null);
				    alert.setContentText("Error running monthly update. Please check and try again.");
				    alert.showAndWait();
				}
			} else if (menuItem5.isSelected()) {
				if (numAccounts > 0) {
					menuPane.setVisible(false);
					printPane.setVisible(true);
					printTextArea.setText(printAccountDetails());
				} else {
					alert.setTitle("Error");
				    alert.setHeaderText(null);
				    alert.setContentText("No bank account to print. Please create an account and try again.");
				    alert.showAndWait();
				}
			} else if (menuItem6.isSelected()) {
				try {
					readRecords();
					alert.setTitle("Information Dialogue");
				    alert.setHeaderText(null);
				    alert.setContentText("Bank account file successfully read.");
				    alert.showAndWait();
				} catch (Exception exception) {
					alert.setTitle("Error");
				    alert.setHeaderText(null);
				    alert.setContentText("Error reading bank account file. Please check and try again.");
				    alert.showAndWait();
				}
			} else if (menuItem7.isSelected()) {
				try {
					writeOutputFile();
					alert.setTitle("Information Dialogue");
				    alert.setHeaderText(null);
				    alert.setContentText("Bank account output file successfully written.");
				    alert.showAndWait();
				} catch (Exception exception) {
					alert.setTitle("Error");
				    alert.setHeaderText(null);
				    alert.setContentText("Error writing bank account output file. Please check and try again.");
				    alert.showAndWait();
				}
				
			}
    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error using bank program options.");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    

    
    /** 
     * This method reads the pressed chequing or savings button and displays the contents of the add pane according to the option
     * @param event ActionEvent cOrSToggleButtons are selected
     */
    @FXML
    void cOrSToggleGroupPressed(ActionEvent event) {
    	try {
    		if (svButton.isSelected()) {
    			//savings button pressed, display interest and minimum balance
    			feeField.setVisible(false);
    			feeLabel.setVisible(false);
    			clearAllTextField();
    			interestLabel.setVisible(true);
    			interestField.setVisible(true);
    			minBalLabel.setVisible(true);
    			minBalField.setVisible(true);	
    		} else if (cqButton.isSelected()) {
    			//chequing button pressed, display monthly fee
    			interestLabel.setVisible(false);
    			interestField.setVisible(false);
    			clearAllTextField();
    			minBalLabel.setVisible(false);
    			minBalField.setVisible(false);
    			feeField.setVisible(true);
    			feeLabel.setVisible(true);
    		} else {
    			alert.setTitle("Error");
    		    alert.setHeaderText(null);
    		    alert.setContentText("Please select an account type.");
    		    alert.showAndWait();
    		    cqButton.setSelected(true);
    		    interestLabel.setVisible(false);
    			interestField.setVisible(false);
    			clearAllTextField();
    			minBalLabel.setVisible(false);
    			minBalField.setVisible(false);
    			feeField.setVisible(true);
    			feeLabel.setVisible(true);
    		}
    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error with program");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    
    /** This method reads the to menu button and goes back to the main menu
     * @param event ActionEvent to menu button is selected
     */
    @FXML
    void toMenuButtonPressed(ActionEvent event) {
    	try {
    		addPane.setVisible(false);
    		menuPane.setVisible(true);
    		clearAllTextField();
    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error with program");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    
    /**
     * This method reads the create button and creates a bank account according to the user input
     * @param event ActionEvent create button is selected
     */
    @FXML
    void createButtonPressed(ActionEvent event) {
    	try {
    		
    		int accNumber;
    		String fName;
    		String lName;
    		long phoneNum;
    		String emailAddr;
    		double openingBalance;
    		double mFee = 0;
    		double minBalance = 0;
    		double interestRate = 0;
    		
    		//if fields are empty, display prompt message
    		if (accountNumField.getText().isEmpty()) {
    			accountNumField.setPromptText("Please enter an account number");
    		} else if (fNameField.getText().isEmpty()) {
    			fNameField.setPromptText("Please enter a value");
    		} else if (lNameField.getText().isEmpty()) {
    			lNameField.setPromptText("Please enter a value");
    		} else if (phoneField.getText().isEmpty()) {
    			phoneField.setPromptText("Please enter a value");
    		} else if (emailField.getText().isEmpty()) {
    			emailField.setPromptText("Please enter a value");
    		} else if (obField.getText().isEmpty()) {
    			obField.setPromptText("Please enter a value");
    		} else {
    			/* if the above fields are filled in */
    			if (cqButton.isSelected()) {
    				//chequing account selected
    				if (!feeField.getText().isEmpty()) {
    					if (Integer.valueOf(accountNumField.getText()) < 0 || Integer.valueOf(accountNumField.getText()) > 99999999) {
    						alert.setTitle("Error");
    					    alert.setHeaderText(null);
    					    alert.setContentText("Invalid account number!");
    					    alert.showAndWait();
    					    accountNumField.setText(null);
    					    return;
    					}
    					accNumber = Integer.valueOf(accountNumField.getText());
    					fName = fNameField.getText();
    					lName = lNameField.getText();
    					phoneNum = Long.valueOf(phoneField.getText());
    					emailAddr = emailField.getText();
    					openingBalance = Double.valueOf(obField.getText());
    					mFee = Double.valueOf(feeField.getText());
    					
    					//create account
    					addAccount('c', accNumber, fName, lName, phoneNum, emailAddr, openingBalance, mFee, minBalance, interestRate);
    					addPane.setVisible(false);
    					menuPane.setVisible(true);
    					
    				    alert.setTitle("Information Dialog");
    				    alert.setHeaderText(null);
    				    alert.setContentText("Chequing account successfully created!");
    				    alert.showAndWait();
    				    clearAllTextField();
    				} else {
    					feeField.setPromptText("Please enter a valid fee.");
    				}
    				
    			
    			} else if (svButton.isSelected()) {
    				// if savings account is selected
    				if (!minBalField.getText().isEmpty() && !interestField.getText().isEmpty()) {
    					accNumber = Integer.valueOf(accountNumField.getText());
    					fName = fNameField.getText();
    					lName = lNameField.getText();
    					phoneNum = Long.valueOf(phoneField.getText());
    					emailAddr = emailField.getText();
    					openingBalance = Double.valueOf(obField.getText());
    					minBalance = Double.valueOf(minBalField.getText());
    					interestRate = Double.valueOf(interestField.getText());
    					addAccount('s', accNumber, fName, lName, phoneNum, emailAddr, openingBalance, mFee, minBalance, interestRate);
    					addPane.setVisible(false);
    					menuPane.setVisible(true);
    					
    					alert.setTitle("Information Dialog");
    				    alert.setHeaderText(null);
    				    alert.setContentText("Savings account successfully created!");
    				    alert.showAndWait();
    				    clearAllTextField();
    				}
    			} else {
    				interestField.setPromptText("Please enter a valid interest rate.");
    				minBalField.setPromptText("Please enter valid minimum balance");
				}
    			
    		}
    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error in creating account!");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    

    
    
    /**
     * This method reads the display button and displays the selected account information
     * @param event ActionEvent display button is selected
     */
   @FXML
   void displayButtonPressed(ActionEvent event) {
	   try {
		   String accInfo;
		   if (!accNumField2.getText().isEmpty() && 
				   !(Integer.valueOf(accNumField2.getText()) < 0) &&
				   !(Integer.valueOf(accNumField2.getText()) > 99999999)) {
			   
			   int accNum = Integer.valueOf(accNumField2.getText());
			   accInfo = displayAccount(accNum);

			   if (!(displayAccount(accNum).equals("a"))) {
				   if (!(accInfo == null)) {
					   String typeAcc = accInfo.split(" ")[0];
				   
					   if (typeAcc.equals("c")) {
						   // if account is a chequing account
						   accTypeField2.setText("Chequing Account");
						   nameField2.setText(accInfo.split(" ")[2] + " " + accInfo.split(" ")[3]);
						   phoneNumField2.setText(accInfo.split(" ")[4]);
						   emailAddrField2.setText(accInfo.split(" ")[5]);
						   balField2.setText("$" + accInfo.split(" ")[6]);
						   mFeeField2.setText("$" + accInfo.split(" ")[7]);
						   return;
					   
					   } else {
						   // if account is a savings account, set visibility to savings settings
						   mFeeLabel2.setVisible(false);
						   mFeeField2.setVisible(false);
						   minBalLabel2.setVisible(true);
						   minBalField2.setVisible(true);
						   intRateLabel2.setVisible(true);
						   intRateField2.setVisible(true);

						   accTypeField2.setText("Savings Account");
						   nameField2.setText(accInfo.split(" ")[2] + " " + accInfo.split(" ")[3]);
						   phoneNumField2.setText(accInfo.split(" ")[4]);
						   emailAddrField2.setText(accInfo.split(" ")[5]);
						   balField2.setText("$" + accInfo.split(" ")[6]);
						   minBalField2.setText("$" + accInfo.split(" ")[8]);
						   intRateField2.setText(accInfo.split(" ")[7] + "%");
						   return;
					   }
				
				   }
			   }
				   // no account found
				   alert.setTitle("Error");
				   alert.setHeaderText(null);
				   alert.setContentText("Account #" + accNum + " does not exist. Please try again.");
				   alert.showAndWait();
				   clearAllTextField();
			   
		   } else {
			   // account number not entered
			   accNumField2.setPromptText("Enter a value");
			   alert.setTitle("Error");
			   alert.setHeaderText(null);
			   alert.setContentText("Please enter a valid account number.");
			   alert.showAndWait();
			   clearAllTextField();
		   }
		   
	   } catch (NumberFormatException nfe) {
		   alert.setTitle("Error");
		   alert.setHeaderText(null);
		   alert.setContentText("Invalid account number. Please try again.");
		   alert.showAndWait();
		   clearAllTextField();
	   } catch (NullPointerException npe) {
		   clearAllTextField();
		   alert.setTitle("Error");
		   alert.setHeaderText(null);
		   alert.setContentText("Enter an account number.");
		   alert.showAndWait();
		   clearAllTextField();
	   } catch (Exception exception) {
		   alert.setTitle("Error");
		   alert.setHeaderText(null);
		   alert.setContentText("Error in displaying account!");
		   alert.showAndWait();
		   clearAllTextField();
   	}
   }
    
    
    
   /**
    * This method reads done button and goes back to the main menu
    * @param event ActionEvent done button is selected
    */
    @FXML
    void doneButtonPressed(ActionEvent event) {
    	try {
    		displayPane.setVisible(false);
    		menuPane.setVisible(true);
    		clearAllTextField();
    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error with program");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    
    
    /**
     * This method reads the update button and updates the account balance by withdraw or deposit methods
     * @param event ActionEvent update button pressed
     * @throws Exception the exception the exception
     */
    @FXML
    void updateButtonPressed(ActionEvent event) throws Exception {
    	try {
    		if (accNumBox.getText().isEmpty()) {
    			//account number not entered, displays error message
    			alert.setTitle("Error");
    		    alert.setHeaderText(null);
    		    alert.setContentText("Please enter a valid account number!");
    		    alert.showAndWait();
    		} else if (amountField.getText().isEmpty() || Double.valueOf(amountField.getText()) < 0) {
    			// if amount is less than zero or not entered, display error
    			alert.setTitle("Error");
    		    alert.setHeaderText(null);
    		    alert.setContentText("Please enter a valid amount!");
    		    alert.showAndWait();
    		    amountField.setText(null);
    		} else {
    		
    			int accNumberInput = Integer.valueOf(accNumBox.getText());
				double amountToModify = Double.valueOf(amountField.getText());
				String whichMode = "";
    			if (depositButton.isSelected()) {
    				updateAccount(accNumberInput, amountToModify);
    				// deposits amount to the balance
    				
    				whichMode = "deposited into";
    				alert.setTitle("Information Dialogue");
    			    alert.setHeaderText(null);
    			    alert.setContentText("Amount $" + amountToModify + " successfully " + whichMode + " account #" + accNumberInput);
    			    alert.showAndWait();
    			    clearAllTextField();
    			    updatePane.setVisible(false);
    			    menuPane.setVisible(true);
    			} else if (withdrawButton.isSelected()){
    				try {
    					updateAccount(accNumberInput, -amountToModify);
    					// withdraws amount from the balance
    					whichMode = "withdrawed from";
        				alert.setTitle("Information Dialogue");
        			    alert.setHeaderText(null);
        			    alert.setContentText("Amount $" + amountToModify + " successfully " + whichMode + " account #" + accNumberInput);
        			    alert.showAndWait();
        			    clearAllTextField();
        			    updatePane.setVisible(false);
        			    menuPane.setVisible(true);
    				} catch (Exception ex) {
    					alert.setTitle("Error");
    				    alert.setHeaderText(null);
    				    alert.setContentText("Insufficient Balance!");
    				    alert.showAndWait();
    				    clearAllTextField();
    				}
    			} else {
    				alert.setTitle("Error");
    			    alert.setHeaderText(null);
    			    alert.setContentText("Please select an update mode!");
    			    alert.showAndWait();
    			}
    		}
    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error updating the balance!");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    
    
    
    
    
    
    /**
     * This method listens to the to menu button in update pane and goes back to the main menu
     * @param event ActionEvent to menu button is pressed
     */
    @FXML
    void toMenuButtonPressed2(ActionEvent event) {
    	try {
    		updatePane.setVisible(false);
    		menuPane.setVisible(true);
    		clearAllTextField();
    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error with program");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    
    /**
     * This method listens to the to menu button in print pane and goes back to the main menu
     * @param event ActionEvent to menu button is pressed
     */
    @FXML
    void toMenuButtonPressed3(ActionEvent event) {
    	try {
    		printPane.setVisible(false);
    		menuPane.setVisible(true);
    		clearAllTextField();
    	} catch (Exception exception) {
    		alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Error with program");
		    alert.showAndWait();
		    clearAllTextField();
    	}
    }
    
    
    
    
	/**
	 * Array of bank account accounts.
	 */
	private ArrayList<BankAccount> accounts;
	
	/**
	 * Integer that holds the number of accounts.
	 */
	private int numAccounts = 0;
	
	/**
	 * Integer that holds the maximum size of bank account array.
	 */
	private int sizeBank = 100;
	
	Scanner input = new Scanner(System.in);
	
	
	/**
	 * Scanner which scans the input file
	 */
	private static Scanner inputFile;
	
	/**
	 * formatter which outputs to the output file
	 */
	private static Formatter outputFile; //outputs text to a file
	
	
	
	
	
	/**
	 * Default constructor
	 * <p>
	 * Instantiates the array of bank accounts.
	 */
	public Bank() {
		//constructor, allocates default size of 1000
		//sizeBank = 1000;
		//accounts = new ArrayList<BankAccount>(sizeBank);
		accounts = new ArrayList<BankAccount>();

		
		
	}

	
	

	/**
	 * Initial constructor
	 * <p>
	 * Parameterized constructor which instantiates the array of bank accounts.
	 * @param sizeArray the maximum size of the bank account array.
	 */
	
	public Bank (int sizeArray) {
		//parameter is size of array to be allocated
		sizeBank = sizeArray;
		accounts = new ArrayList<BankAccount>(sizeBank);
	}
	
	
	
	
	
	/**
	 * Adds an account to the array
	 * <p>
	 * Prompts user to enter data for an account which is added to array either chequing or savings account is added if there is room
	 * @param 
	 * @return boolean value of whether the account is added successfully or not.
	 */
	
	
	
	/**
	 * Adds an account to the array
	 * <p>
	 * Prompts user to enter data for an account which is added to array either chequing or savings account is added if there is room
	 * @param sOrC char value of savings or chequing account
	 * @param accNumber int value of account number
	 * @param fName String value of first name
	 * @param lName String value of last name
	 * @param phoneNum long value of phone number
	 * @param emailAddr String value of email address
	 * @param openingBalance double value of opening balance
	 * @param mFee double value of monthly fee
	 * @param minBalance double value of minimum balance
	 * @param interestRate double value of interest rate
	 * @return boolean value of whether the account is added successfully or not.
	 */
	public boolean addAccount(char sOrC, int accNumber, String fName,
			String lName, long phoneNum, String emailAddr, double openingBalance, double mFee,
			double minBalance, double interestRate) {
		//account successfully add or not
		
		if (numAccounts >= sizeBank) {
			//if there is no room in array
			return false;
		}
		
		//else create account
		BankAccount createAcc = null;
		//when making the account is stopped midway, the unfinished account isn't stored

		
		//prompts user to enter valid value of s or c, checks and creates an account.
		validAccType: while(true) {
				
				try {
					if (sOrC == 's') {
						//if user input is s
						createAcc = new SavingsAccount();
						//creates a savings account
						break validAccType;
					} else if (sOrC == 'c') {
						//if user input is c
						createAcc = new ChequingAccount();
						//creates a chequing account
						break validAccType;
					} else {
						//if user input is not s or c
						return false;
					}
				} catch (NullPointerException nullEx) {
					//catches null exception
					return false;
				}

			}
		
		
		if (createAcc.addBankAccount(accNumber, fName, lName, phoneNum, emailAddr, openingBalance, mFee, minBalance, interestRate)) {
			//account added successfully
			accounts.add(createAcc);
			//apply the copy of account to create a full account
			numAccounts++;
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	/**
	 * Finds and displays the specific account
	 * <p>
	 * Prompts user to enter an account number to display, then returns data 
	 * formatted to display or an error message. This should use toString() from 
	 * BankAccount class
	 * @param accNum int value of account number
	 * @return String value of the formatted account information
	 */
	public String displayAccount(int accNum) throws Exception{
		
		int index = findAccount(accNum);
		//using index from the findAccount method
		
		if (index < 0) {
			//if index is not found
			throw new Exception("No such account");
		} else {
		//displays selected account
			
			
			String typeAcc = "";
			
			if (accounts.get(index) instanceof SavingsAccount) {
				//if account is a savings account
				typeAcc = "s ";
			} else if (accounts.get(index) instanceof ChequingAccount) {
				//if account is a chequing account
				typeAcc = "c ";
			}
			typeAcc += accounts.get(index).toString();
			
			
			
			return (typeAcc + "\n");
			//displays selected account
			
			
		}
	}
	
	
	
	
	
	/**
	 * Prints details of all accounts
	 * @return the String value of all account information
	 */
	public String printAccountDetails() {
		//prints details of all accounts
		
		String printAccounts = "";
		
		try {
			//openOutputFile();
			//open the output file
		
	
			for (BankAccount i: accounts) {
				String typeAcc = "";
			
				if (i instanceof SavingsAccount) {
					//if account is a savings account
					typeAcc = "s ";
				} else if (i instanceof ChequingAccount) {
					//if account is a chequing account
					typeAcc = "c ";
				}
				typeAcc += i.toString() + "\n";
			
				//outputFile.format(typeAcc);
				//write to output file
				printAccounts += typeAcc;
				//display to the command line
			}
		
			//closeOutputFile();
			//close the output file
		
		} catch (FormatterClosedException formatterClosedException) {
			return "";
		} catch (NoSuchElementException elementException) {
			return "";
		}
		return printAccounts;
	}


	
	
	
	

	/**
	 * Updates the balance of the selected account
	 * <p>
	 * prompts user to enter which account number to update, and by how much and then updates the balance appropriately returns success message or error message
	 * @param accNum int value of account number
	 * @param modifyAmount double value of modify amount
	 * @throws Exception the exception
	 */
	public void updateAccount(int accNum, double modifyAmount) throws Exception {
		
		int index = findAccount(accNum);
		//using index from the findAccount method
		
		if (index < 0) {
			//if index is not found
			throw new Exception("Account Not Found.");
		}	
		
		//prompts the user for the valid modifying amount and updates the balance
		validAmount:
			while(true) {
					
					if(modifyAmount >= 0) {
						accounts.get(index).updateBalance(modifyAmount);
						//if the amount is positive, just add the amount
					} else {
						String balance = accounts.get(index).toString().split(" ")[5];
						double subtractAmount = Math.abs(modifyAmount);
						if (subtractAmount > Double.valueOf(balance)) {
							//if balance is less than amount for withdraw, print error
							throw new Exception("Not enough balance.");
						}
						accounts.get(index).updateBalance(modifyAmount);
					}
					break validAmount;
			}
	}
	
	
	
	
	/**
	 * Finds the account using the account number
	 * <p>
	 * prompts user to enter which account number they wish to find and 
	 * returns array index of where it is found otherwise returns -1
	 * @param accNum int value of account number
	 * @return int value of account array number
	 */
	public int findAccount(int accNum) throws Exception{
		
		//prompts the user for the valid account number and returns the index of the account
			String validAccNum = String.valueOf(accNum);
			int sizeArray = 1;
					
			if (accounts.size() >= 1) {
			sizeArray = accounts.size();
					
				for (int i = 0; i < sizeArray ; i++) {
					BankAccount eachAccount = accounts.get(i);
					String [] section = eachAccount.toString().split(" ");
					//splits bank account info by space into first name, last name,
					//account number, phone number, email, balance, etc						
							
					String accountNum = section[0];
							
					if (accountNum.equals(validAccNum)) {
						//if accountNumber is found
						return i;
					}
				}
				return -1;
			} else {
				return -1;
			}
			
	}
	

	
	/**
	 * Performs a monthly update on every bank accounts
	 * <p>
	 * process through each current account in the array and updates 
	 * the balance appropriately
	 * @throws Exception the exception the exception 
	 */
	public void monthlyUpdate() throws Exception {
		
		for (BankAccount each: accounts) {
			each.monthlyAccountUpdate();
			//performs monthly account update on every accounts
		}
	}

	
	
	
	

	/**
	 * opens the input file
	 * @throws IOException ioexception 
	 */
	public void openInputFile() throws IOException {

			inputFile = new Scanner(Paths.get("bankData.txt"));
			//try to open inputfile
	}

	
	
	
	
	/**
	 * reads the records of the input file
	 * <p>
	 * stores the accounts in the input file into the account array list
	 * @throws IOException ioexception 
	 */
	public void readRecords() throws IOException {
		//write new account on the file
		
		openInputFile();
		// open input file
		
		
		if (inputFile == null) {
			//check if the input file has been correctly opened
		      return;
		 }
		

			while (inputFile.hasNext()) {
				
				
				//while input file has info to read
			
				String acctype = inputFile.next();
				int accNum = inputFile.nextInt();
				String firstName = inputFile.next();
				String lastName = inputFile.next();
				long phoneNum = inputFile.nextLong();
				String email = inputFile.next();
				double balance = inputFile.nextDouble();


				Person inputUser = new Person(firstName, lastName, phoneNum, email);
				BankAccount inputAccount;
				
				
				switch(acctype.charAt(0)) {
				
				case('s'):
					//saving account
					//expected to have a minimum balance at the end
					double intRate = inputFile.nextDouble();
					double minBal = inputFile.nextDouble();

					inputAccount = new SavingsAccount(accNum, inputUser, balance, minBal, intRate);
					accounts.add(inputAccount);
					numAccounts++;
					break;
					
				case ('c'):
					//chequing account
					
					double fee = inputFile.nextDouble();
					//generates random fee between values of 5 and 10
					
					inputAccount = new ChequingAccount(accNum, inputUser, balance, fee);
					accounts.add(inputAccount);
					numAccounts++;
					break;
					
				default:
					//error
					return;
			
				}
				
			}
	}
		
	
	
	
	
	/**
	 * closes the input file
	 */
	public void closeInputFile() {
		
		if (inputFile != null) {
			//make sure no exceptions were thrown by checking if the
			// file is empty
			inputFile.close();
		}
	}
	
	
	
	
	
	/**
	 * opens the output file
	 */
	public void openOutputFile() {
		
		try {
			outputFile = new Formatter("bankDataOutput.txt");
			//open the output file
		} catch (SecurityException securityException) {
			// if there is no permission to access it
		} catch (FileNotFoundException fileNotFoundException) {
			//if the file is not found.
			return;
		}
	}
	
	
	/**
	 * writes output file
	 */
	public void writeOutputFile() {
		//writes details of all accounts
		
			openOutputFile();
			//open the output file
		
	
			for (BankAccount i: accounts) {
				String typeAcc = "";
			
				if (i instanceof SavingsAccount) {
					//if account is a savings account
					typeAcc = "s ";
				} else if (i instanceof ChequingAccount) {
					//if account is a chequing account
					typeAcc = "c ";
				}
				typeAcc += (i.toString() + "\n");
			
				outputFile.format(typeAcc);
				//write to output file
			}
		
			closeOutputFile();
			//close the output file
	}
	
	
	/**
	 * closes the output file.
	 */
	public void closeOutputFile() {
		
		if (outputFile != null) {
			// make sure no exceptions are thrown by
			// checking the output is written
			outputFile.close();
		}
	}	

}//end of class Bank
