package day2;
import java.util.Scanner;
import java.lang.Math;
public class fruitseller {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the price of a dozen mangoes");
			float tprice = sc.nextFloat();
			System.out.println("Enter the price at which 1 mango is being selled");
			int sell = sc.nextInt();
			sell *=12;
			float selled = Math.abs((float) tprice - sell);
			if(sell < tprice)
			{
				System.out.printf("loss:RS.%.2f",selled);
			}
			else if (sell > tprice)
			{
				System.out.printf("profit:RS.%.2f",selled);
			}
		}
		

	}

}
