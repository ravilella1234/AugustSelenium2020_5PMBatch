package com.kotak.loans.personalloans;

public class ArrayOfObjects 
{

	public static void main(String[] args) 
	{
		Emp e1 = new Emp(100, "ravilella");
		Emp e2  = new Emp(200, "sai");
		Emp e3 = new Emp(300, "maha");
		
		//System.out.println(e1);
		//System.out.println(e2);
		//System.out.println(e3);
		
		Emp[] e = new Emp[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		
		for(Emp x:e)
		{
			System.out.println(x);
		}

	}
}


class Emp
{
	int eno;
	String ename;
	
	public Emp(int eno, String ename)
	{
		super();
		this.eno = eno;
		this.ename = ename;
	}

	@Override
	public String toString()
	{
		return "Emp [eno=" + eno + ", ename=" + ename + "]";
	}
	
	
	
	
}
