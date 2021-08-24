package day2;

import java.util.Scanner;

public class green {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			float speed = sc.nextFloat();
			float distance = sc.nextFloat();
			float time =sc.nextFloat();
			if(speed*distance<=time)
			{
				System.out.println("no");
			}
			else
			{
				System.out.println("yes");
			}
		}
	}

}
