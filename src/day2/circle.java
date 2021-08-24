package day2;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			int distSq = (x1 - x2) * (x1 - x2) +(y1 - y2) * (y1 - y2);
			int radSumSq = (r1 + r2) * (r1 + r2);
			if (distSq == radSumSq)
			{
				System.out.println("The circles are tangential");
			}
			else if(distSq<radSumSq)
			{
				System.out.println("The circles overlap");
			}
			else
			{
				System.out.println("the circles are tangential");
			}
		}

	}

}
