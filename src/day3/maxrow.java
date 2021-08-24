package day3;

import java.util.Scanner;

public class maxrow {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			System.out.println("enter row");
			int row=sc.nextInt();
			System.out.println("enter col");
			int col=sc.nextInt();
			int arr[][]=new int[row][col];
			int max=(int) 0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(max<arr[i][j])
					{
						max=arr[i][j];
					}
				}
				System.out.print(max+" ");
				max=0;
			}
		}
			

	}

}
