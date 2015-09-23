package ps3;

import java.util.Date;

public class Account {
	// Data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	// Create no-arg constructor for default account
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	// Create constructor with specified id and balance
	public void specificAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	// Getter for id
	public int getId() {
		return id;
	}
	// Setter for id
	public void setId(int id) {
		this.id = id;
	}
	// Getter for balance
	public double getBalance() {
		return balance;
	}
	// Setter for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// Getter for annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	// Setter for annual interest rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	// Getter for date created
	public Date getDateCreated() {
		return dateCreated;
	}
	// Getter for monthly interest rate
	public double getMonthlyInterestRate() {
		// Divide annual interest rate by 12 months
		return getAnnualInterestRate() / 12;

	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
}
