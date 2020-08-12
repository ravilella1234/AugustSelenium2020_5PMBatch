package com.kotak.loans.eduloans;

public interface Rbi 
{
	void withdrawl();
	void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		Rbi i;
		i = new Icici();
		i.deposit();
		i.withdrawl();
		
		i = new Hdfc();
		i.deposit();
		i.withdrawl();
	}
	
}
