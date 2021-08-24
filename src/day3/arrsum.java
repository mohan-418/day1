package day3;

import java.util.Scanner;

public class arrsum {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			System.out.println("enter size");
			int n=sc.nextInt();
			int sum[]=new int[n];
			for(int i=0;i<n;i++)
			{
				sum[i]=sc.nextInt();
			}
			System.out.println("the elements are");
			for(int i=0;i<n;i++)
			{
				System.out.println(sum[i]);
			}
			int temp=0;
			for(int i=0;i<n;i++)
			{
				temp=temp+sum[i];
			}
			for(int i=0;i<n;i++);
			System.out.println("sum:");
				System.out.println(temp);
		}

	}

}
