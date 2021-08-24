package day2;
import java.util.Scanner;
public class movie {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your age");
			int age =sc.nextInt();
			System.out.println("Enter show timing");
			double timming=sc.nextDouble();
			if(age>13) 
			{
			    if(timming==13.30)
				{
					System.out.println("the ticket price is $5.00");
				}
				else 
				{
					System.out.println("the ticket price is $8.00");
				}
			}
		   if (age<13)
			{
				if(timming==13.30)
				{
					System.out.println("the ticket price is $2.00");
				}
				else
				{
					System.out.println("the ticket price is $5.00");
				}
			}
		}

	}

}
