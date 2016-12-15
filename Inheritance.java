class Sample1
{
	int a=10;
	void test()
	{
		System.out.println("value of a is" +a);
	}
}
class Sample2 extends Sample1
{

}

public class Inheritance
{
	public static void main(String []args)
	{
		System.out.println("main method started");

		Sample2 s2=new Sample2();
		s2.test();
		System.out.println("main method ended");
	}
} 
