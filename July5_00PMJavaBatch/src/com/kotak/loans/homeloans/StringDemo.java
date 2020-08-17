package com.kotak.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "Ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.contains("kanth"));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.startsWith("Ravi"));
		System.out.println(s1.endsWith("nth"));
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		s1= s1+s2;
		System.out.println(s1);
		
		s1 = s1.concat(s2) ;
		System.out.println(s1);
		
		String s3= "ravi";
		String s4= "Ravi";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.contains("Rav"));
		System.out.println(s3.contains(s4.toLowerCase()));
		
		String s5 = " sairam";
		System.out.println(s5);
		System.out.println(s5.trim());
		String s6 =  "Sairam";
		System.out.println(s5.equals(s6));
		System.out.println(s5.trim().equals(s6));
		System.out.println(s5.trim().equals(s6.toLowerCase()));
		
		System.out.println(s1);
		System.out.println(s1.substring(1, 7));
		
		System.out.println(s1.replace('R', 'k'));
		
		String s7 = "ravi kanth";
		System.out.println(s7);
		String[] str = s7.split(" ");
		System.out.println(str[0]);
		System.out.println(str[1]);
		

	}

}
