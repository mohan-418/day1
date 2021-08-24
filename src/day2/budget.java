package day2;

import java.util.Scanner;

public class budget {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			float f = (float) (a * 350.34);
			float g =(float) (b * 230.90);
			float h =(float)(c * 190.55);
			float i =(float)(d*120.30);
			float j =(float)(e*180.90);
			if(f+g+h+i+j<=15000)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
				
			}
		}
		

	}

}
