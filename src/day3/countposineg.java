package day3;
import java.util.Scanner;
public class countposineg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Size, i=0;
		int positiveCount = 0, negativeCount = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(" Please Enter Number of elements in an array : ");
			Size = sc.nextInt();	
			
			int [] a = new int[Size];
			
			System.out.print(" Please Enter " + Size + " elements of an Array  : ");
			for (i = 0; i < Size; i++)
			{
				a[i] = sc.nextInt();
			}   

			for(i = 0; i < Size; i++)
			{
				if(a[i] >= 0)
				{
					positiveCount++;
				}
				else
				{
					negativeCount++;
				}
			}
		}
	 
		System.out.println("Number of positive numbers entered is "+positiveCount +" and the number of negative numbers entered is "+negativeCount);
	}

		

	}


