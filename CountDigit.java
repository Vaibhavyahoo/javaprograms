import java.util.Scanner;
public class CountDigit
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int Number=sc.nextInt();
		int  rem=0;
		int Count=0;
		while(Number>0)
		{
			rem=Number%10;
			Count++;
			Number=Number/10;
		}
		System.out.println("Number of digit" +Count);

	}
}


