package day2;
import java.util.Scanner;
public class annauniver {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
			if(num==100)
			{
				System.out.println("s");
			}
			else if(num>90 && num<100)
			{
				System.out.println("A");
			}
			else if(num>80 && num<90)
			{
				System.out.println("B");
			}
			else if(num>70 && num<80)
			{
				System.out.println("C");
			}
			else if(num>60 && num<70)
			{
				System.out.println("D");
			}
			else if(num>50 && num<60)
			{
				System.out.println("E");
			}
			else if(num<50)
			{
				System.out.println("F");
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		

	}

}
