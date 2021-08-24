package day2;

import java.util.Scanner;

public class microwave {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the number of items");
			int number =sc.nextInt();
			System.out.println("Enter the single item heating time");
			float heat =sc.nextFloat();
			if (number == 2)
			{
				System.out.println(heat + ((0.5)*heat));
			}
			else if (number == 3)
			{
				System.out.println(heat*2);
				
			}
			else if(number > 3)
			{
				System.out.println("not recommended");
			}
		}
		

	}

}
