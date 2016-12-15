import java.util.Scanner;
public class Digitsum
{
	public static void main(String []args)
	{
                Scanner sc=new Scanner(System.in);
                System.out.println("enter Number");
                int Number=sc.nextInt();
		int sum=0;
		int r=0;
		while(Number>0)
		{
			r=Number%10;
			sum+=r;
			Number=Number/10;
		}
		System.out.println(" " +sum);
	}
}


