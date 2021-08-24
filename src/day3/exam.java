package day3;
import java.util.Scanner;
public class exam {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			System.out.println("enter size");
			int n=sc.nextInt();
			int age[]=new int[n];
			for(int i=0;i<n;i++)
			{
				age[i]=sc.nextInt();
			}
			System.out.println("the elements are");
			for(int i=0;i<n;i++)
			{
				System.out.println(age[i]);
			}
			int temp=0;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if (age[i]>age[j])
					{
						temp =age[i];
						age[i]=age[j];
						age[j]=temp;
						
					}
				}
			}
			for(int i=0;i<n;i++);
				System.out.println(age[n-1]);
		}

	}

}
