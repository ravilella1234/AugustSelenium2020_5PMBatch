package com.kotak.loans.personalloans;

public class MethodOverloading
{
	
	/*
	 * void m1(int x) { System.out.println(x); }
	 */
	
	/*
	 * void m1(float x) { System.out.println(x); }
	 */
	
	/*
	 * void m1(Integer x) { System.out.println(x); }
	 */
	
	/*
	 * void m1(Number x) { System.out.println(x); }
	 */
	
	
	/*
	 * void m1(String x) { System.out.println(x); }
	 */
	
	void m1(Object x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading obj  = new MethodOverloading();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("ravilella");
		obj.m1(1234);
		obj.m1(23.34f);
		obj.m1("sai");
	}

}
