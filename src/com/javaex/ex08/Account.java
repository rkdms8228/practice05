package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;
	private int sum = 0;

	//생성자 작성
	public Account() {
	}
	
	public Account(String accountNo) {
		this.accountNo = accountNo;

	}
	
	//필요한 메소드 작성
	//gs
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	//일반
	public void deposit(int money) {
		sum = money;
	}

	public void withdraw(int money) {
		balance = sum-money;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}

}
