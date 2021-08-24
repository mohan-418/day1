package day2;
	import java.util.Scanner;

	public class hotel {

		public static void main(String[] args) {
			try (// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in)) {
				int month =sc.nextInt();
				int amount =sc.nextInt();
				int days=sc.nextInt();
				if (month>0 && month<13)
				{
				    
				    if( month == 4 )
					{
						System.out.println(((20*amount)/100)*days + amount *days);
					}
					else if( month == 5 )
					{
						System.out.println(((20*amount)/100)*days+ amount *days);
					}
					else if( month == 11 )
					{
						System.out.println(((20*amount)/100)*days+ amount *days);
					}
					else if( month == 12 )
					{
						System.out.println(((20*amount)/100)*days+ amount *days);
					}
					else
					{
						System.out.println(amount*days);
					}
					
				}
				else 
				{
					System.out.println("Invalid Input");
				}
			}

		}

	}

