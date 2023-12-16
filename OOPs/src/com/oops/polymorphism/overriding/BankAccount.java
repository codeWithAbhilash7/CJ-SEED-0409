package com.oops.polymorphism.overriding;

public class BankAccount {
	private long bankAccountNumber;
	private String bankName;
	private String iFSCCode;
	private String accountType;

	public BankAccount(String bankName, String iFSCCode, String accountType) {
		super();
		bankAccountNumber = 1;
		this.bankName = bankName;
		this.iFSCCode = iFSCCode;
		this.accountType = accountType;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getiFSCCode() {
		return iFSCCode;
	}

	public void setiFSCCode(String iFSCCode) {
		this.iFSCCode = iFSCCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountNumber=" + bankAccountNumber + ", bankName=" + bankName + ", iFSCCode="
				+ iFSCCode + ", accountType=" + accountType + "]";
	}

}
