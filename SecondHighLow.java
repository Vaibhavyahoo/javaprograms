import java.util.Scanner;
public class SecondHighLow
{
	 static int high=0;
		static int shigh=0;
	static	int low=10;
		static int slow=10;
		static int rem=0;
		public static void main(String []args)
	{try{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int Number=sc.nextInt();
		while(Number>0)
		{
			rem=Number%10;    //getting single digit
			if(rem>high)
			{
				shigh=high;
				high=rem;
			}
			else if(rem<low)
			{
				slow=low;
				low=rem;
			}
			Number=Number/10;
		}
		System.out.println("high" +high);
		System.out.println("second high"+shigh);
		System.out.println("low" +low);
		System.out.println("second low"+slow);
	}catch(Exception e){System.out.println(""+e);}}
}
