package com.kotak.loans.personalloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * int[] a= {10,20,30,40};
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println("a["+i+"]="+a[i]); }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int aSize = sc.nextInt();
		
		int[] a = new int[aSize];
		int sum=0;
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum+a[i];
		}
		System.out.println("Sum of Array Elements : " + sum);
	}

}
