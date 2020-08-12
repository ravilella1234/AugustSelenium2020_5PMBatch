package com.kotak.loans.eduloans;

public abstract class FirstAbstract 
{
	int x=100;
	
	public void m1()
	{
		System.out.println("iam m1 concrete from FirstAbstract...");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) 
	{
		//FirstAbstract obj = new FirstAbstract();
		
		FirstAbstract i = new ChildClass();	
		i.m1();
		i.m2();
	}
	
}
