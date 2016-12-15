import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int Number=sc.nextInt();
		int  rem=0;
		int ReverseNumber=0;
		while(Number>0)
		{
			rem=Number%10;
			ReverseNumber=ReverseNumber*10+rem;
			Number=Number/10;
		}
		System.out.println("Reverse Number is" +ReverseNumber);

	}
}


