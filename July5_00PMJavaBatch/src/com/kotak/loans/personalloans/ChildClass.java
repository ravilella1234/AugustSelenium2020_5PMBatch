package com.kotak.loans.personalloans;

class Parent
{
	public  Number workhard()
	{
		System.out.println("parent : wakeup early,goto college");
		return 0;
	}
	
	void care()
	{
		System.out.println("parent : atmost care....");
	}
	
}


public class ChildClass extends Parent
{
	public  Object workhard()
	{
		System.out.println("child : wakeup anytime,goto bar/parlour");
		return 0;
	}
	
	void love()
	{
		System.out.println("child : iam in love....");
	}

	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.workhard();
		c.care();
		c.love();

	}

}
