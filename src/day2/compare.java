package day2;
import java.util.Scanner;
public class compare {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1<num2)
			{
				System.out.println(num1 +"is less than"+ num2);
			}
			else if(num1>num2)
			{
				System.out.println(num1 + "is greater than"+ num2);
			}
			else if(num1==num2)
			{
				System.out.println(num1 +"is equal to"+ num2);
			}
		}

	}

}
