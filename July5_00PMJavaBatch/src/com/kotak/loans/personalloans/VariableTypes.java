package com.kotak.loans.personalloans;

public class VariableTypes
{
	//prmitive variable
	int x=100; //instance (or) global (or) non-static variable
	static String cname="vmware";  // static (or) global variable
	static VariableTypes obj;
	
	void m1()
	{
		int x=200;  // local variable
		//System.out.println(y);
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
	}
	
	static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	
	public static void main(String[] args) 
	{
		 obj = new VariableTypes(); // reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
