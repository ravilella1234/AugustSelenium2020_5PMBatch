package com.kotak.loans.personalloans;

public   class FinalVariable 
{
	public  int a=10;
	static int b=20;
	public final static String cname= "vmware";
	
	

	public static void main(String[] args) 
	{
		int c=30;
		FinalVariable f1= new FinalVariable();
		System.out.println(f1.a);
		f1.a=100;
		System.out.println(f1.a);
		
		System.out.println(FinalVariable.b);
		FinalVariable.b=200;
		System.out.println(FinalVariable.b);
		
		System.out.println(c);
		c=300;
		System.out.println(c);

	}

}
