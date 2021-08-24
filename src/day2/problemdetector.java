package day2;
import java.util.Scanner;
public class problemdetector {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int bir,cur;
			int age=0;
			bir = sc.nextInt();
			cur = sc.nextInt();
			
			if (cur > bir) 
			{
				age =cur-bir;
			}
			else if (cur < bir)
			{
				age = ( cur+100)-bir;
			}
			System.out.println(age);
		}

	}

}
