package com.kotak.loans.personalloans;

import com.kotak.loans.homeloans.A;
import com.kotak.loans.homeloans.B;

public class C extends B
{
	
	void m3()
	{
		System.out.println("iam m3 from C");
	}
	
	
	public static void main(String[] args)
	{
		C  c = new C();
		c.m3();
		c.m1();
	}

}
