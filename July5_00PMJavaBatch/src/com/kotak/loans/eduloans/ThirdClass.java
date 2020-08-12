package com.kotak.loans.eduloans;

public class ThirdClass 
{
	
	int x=10,y=20,result; //properties
	
	void add()
	{
		result = x + y;
		System.out.println("Addition of A & B is : " + result);
	}
	
	
	void sub()
	{
		result = x - y;
		System.out.println("Sub of A & b is : " + result);
	}

	public static void main(String[] args) 
	{		
		ThirdClass obj = new ThirdClass();
		obj.add();
		obj.sub();
		
		ThirdClass obj1 = new ThirdClass();
		obj1.add();
		obj1.sub();
	}

}
