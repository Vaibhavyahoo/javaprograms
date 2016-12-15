import java.util.Scanner;
public class CountEvenOdd
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int Number=sc.nextInt();
		int  rem=0;
		int EvenCount=0;
		int oddCount=0;
		while(Number>0)
		{
			rem=Number%10;
			if(rem%2==0)
			{
				EvenCount++;
				//        System.out.println("Number of even digit is :" +EvenCount);
			}

			else
			{
				oddCount++;
				//        System.out.println("odd digit :" +oddCount);
			}
			Number=Number/10;
//			System.out.println("Number of even digit is :" +EvenCount);
//			System.out.println("odd digit :" +oddCount);


		}System.out.println("Number of even digit is :" +EvenCount);
                        System.out.println("odd digit :" +oddCount);

	}
}


