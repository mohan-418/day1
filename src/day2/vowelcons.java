package day2;
import java.util.Scanner;

public class vowelcons {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			char ch = sc.next().charAt(0);
			int num = (int) ch;
			if (num>64&&num<91||num>96&&num<123)
			{
				char cha=(char)num;
				if(cha=='a'||cha=='i'||cha=='o'||cha=='u'||cha=='e'||cha=='A'||cha=='O'||cha=='U'||cha=='I'||cha=='E')
				{
					System.out.println("vowels");
				}
				else
				{
					System.out.println("consonants");
				}
			}
			else 
			{
				System.out.println("not alphabets");
			}
		}
	}

}
