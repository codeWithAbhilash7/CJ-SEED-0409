package com.core.interfaces.usecase;

//public class Employee extends PersonalDetails, BankAccount  {
public class Employee implements PersonalDetails, BankAccount {

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collectDocuments() {
		System.out.println("Documents are collected and verified and stored");

	}

	@Override
	public void collectPersonalDetails() {
		// TODO Auto-generated method stub
		System.out.println("Personal details are collected and verified and stored");
	}

	@Override
	public void openNewBankAccount() {
		// TODO Auto-generated method stub
		System.out.println("New bank account created...");

	}

}
