package phase2;
import java.util.Scanner;
import java.lang.Math;
public class question8 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			int power =(int) (Math.pow(x,n));
			System.out.println(power);
		}

	}

}
