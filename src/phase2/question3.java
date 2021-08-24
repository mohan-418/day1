package phase2;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = i;
			i = j;
			j = k;
			System.out.println(i);
			System.out.println(j);
			
		}

	}

}
