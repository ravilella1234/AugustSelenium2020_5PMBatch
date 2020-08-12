package com.kotak.loans.personalloans;

import com.kotak.loans.mortgageloans.X;

public class Z extends X
{
	public void m1()
	{
		System.out.println("iam m1 from X");
	}
	
	void m3()
	{
		System.out.println("iam m3 from Z");
	}

	public static void main(String[] args) 
	{
		X x = new X();
		x.m1();
		System.out.println(x.var);
		
		Z z  = new Z();
		z.m3();
		z.m1();
		System.out.println(z.var);
	}

}
