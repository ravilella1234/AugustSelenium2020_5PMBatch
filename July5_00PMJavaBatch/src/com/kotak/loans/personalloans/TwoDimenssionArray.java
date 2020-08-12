package com.kotak.loans.personalloans;

public class TwoDimenssionArray 
{

	public static void main(String[] args) 
	{
		//int[] a = {10,20,30};
		
		int a[][] = {
						{1,2,3,0},
						{4,5,6},
						{7,8,9,1,2}
					};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		for(int p[]:a)
		{
			for(int q:p)
			{
				System.out.print(q + "  ");
			}
			System.out.println();
		}
		
		
			
	}

}
