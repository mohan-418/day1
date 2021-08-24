package phase2;
import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int prin =sc.nextInt();
			int period=sc.nextInt();
			float rateofinterest=sc.nextFloat();
			float result = (prin*period*rateofinterest)/100;
			System.out.printf("%.2f", result);
		}

	}

}
