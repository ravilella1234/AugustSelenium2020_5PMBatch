package com.kotak.loans.mortgageloans;

import java.util.Date;

public class X 
{
	public int var=100;
	
	public  void m1()
	{
		System.out.println("iam m1 from X");
	}
	
	public static void m5()
	{
		System.out.println("iam m5 static....");
	}
	
	static
	{
		System.out.println("iam static block....");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}

	public static void main(String[] args) 
	{
		X x = new X();
		x.m1();
		m5();
		System.out.println(x.var);
	}

}
