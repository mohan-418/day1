package day2;
import java.util.Scanner;
public class feecollection {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.printf("Enter the student type");
			String student = sc.next();
			System.out.printf("Enter tuition fee");
			float tution =sc.nextFloat();
			System.out.printf("Enter bus fee");
			float bus =sc.nextFloat();
			System.out.printf("Enter hostel fee");
			float hostel=sc.nextFloat();
			switch(student) 
			{
			case "MSDS" :
			{
				System.out.printf("The fees to be paid by the student is Rs%.2f",tution+bus);
				break;
			}
			case "MSH":
			{
				System.out.printf("The fees to be paid by the student is Rs%.2f",tution+hostel);
				break;
			}
			case "MSGDS":
			{
				System.out.printf("The fees to be paid by the student is Rs%.2f",((150*tution)/100)+bus);
				break;
			}
			case "MGSH":
			{
				System.out.printf("The fees to be paid by the student is Rs%.2f",((150*tution)/100)+hostel);
				break;
			}
			}
		}

	}

}
