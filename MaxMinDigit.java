import java.util.Scanner;
public class MaxMinDigit
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int Number=sc.nextInt();
		int  rem;
		int High=-1;
		int low=10;
		//rem=Number%10;
		//High=rem; 
		while(Number>0)
		{
			rem=Number%10;
			if(rem>High)
			{
				High=rem;
			}
			if (rem<low)
			{
				low=rem;
			}

			Number=Number/10;
		}
		System.out.println("high of digit" +High);
		System.out.println("lower digit is"+low);

	}
}


