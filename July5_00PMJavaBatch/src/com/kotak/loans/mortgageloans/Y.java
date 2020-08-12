package com.kotak.loans.mortgageloans;

public class Y extends X
{
	public void m1()
	{
		System.out.println("iam m1 from X");
	}
	
	void m2()
	{
		System.out.println("iam m2 from Y");
	}

	public static void main(String[] args) 
	{
		X x = new X();
		x.m1();
		System.out.println(x.var);
		
		Y y = new Y();
		y.m2();
		y.m1();
		System.out.println(y.var);
	}

}
