package day3;

import java.util.Scanner;

public class sum2arr {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
						// TODO Auto-generated method stub
				Scanner sc = new Scanner (System.in)) {
					System.out.println("enter size");
					int n=sc.nextInt();
					int arr1[]=new int[n];
					int arr2[]=new int[n];
					int sum[]=new int[n];
					for(int i=0;i<n;i++)
					{
						arr1[i]=sc.nextInt();
					}
					for(int i=0;i<n;i++)
					{
						arr2[i]=sc.nextInt();
						sum[i]=arr1[i]+arr2[i];
					}
					for(int i=0;i<n;i++)
					{
						System.out.println(sum[i]);
					}
				}
				
				

	}

}
