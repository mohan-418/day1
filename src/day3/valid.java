package day3;

import java.util.Scanner;

public class valid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int count = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(" Please Enter Number of elements in an array : ");
			int num = sc.nextInt();	
			
			int [] a = new int[num];
			
			System.out.print(" Please Enter " + num + " elements of an Array  : \n");
			for (i = 0; i < num; i++)
			{
				System.out.println("enter the number");
				a[i] = sc.nextInt();
				
			}   
			//for (i = 0; i < num; i++)
			//{
				//System.out.println(a[i]);
			//}
			

			
			i =0;
			while(i<num)
			{
				if(a[i]%8==0)
				{
					count++;
				}
				i++;
			}
			
		
	 
		System.out.println("Number of divisible numbers by 8 numbers entered is "+count);
		}
	}

}
