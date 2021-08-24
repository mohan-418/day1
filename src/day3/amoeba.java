package day3;
import java.util.Scanner;
public class amoeba {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of months:");
			int num = sc.nextInt();
			int a = 0;
			int b = 1;
			int sum ;
			for(int i=2;i<=num;i++)
			{
				sum=a+b;
				a=b;
				b=sum;
				
			}System.out.println("The amoeba size is "+a);
			
		}

	}

}
