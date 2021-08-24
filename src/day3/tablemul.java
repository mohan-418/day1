package day3;
import java.util.Scanner;
public class tablemul {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int num=1;
			while(num<=m)
			{
				int a = num*n;
				System.out.println(num+"*"+n+"="+a);
				num++;
			}
		}
		

	}

}
