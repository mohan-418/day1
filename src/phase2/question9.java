package phase2;
import java.util.Scanner;
public class question9 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			String result = (num%2==0)?"even":"odd";
			System.out.println(result);
		}
	

	}

}
