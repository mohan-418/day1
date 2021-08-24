package phase2;
import java.util.Scanner;
public class question6 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			int side = sc.nextInt();
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			float radius =sc.nextFloat();
			System.out.println(side*side);
			System.out.println(length*breadth);
			System.out.printf(".%2f",3.14*radius*radius);
		}
		

	}

}
