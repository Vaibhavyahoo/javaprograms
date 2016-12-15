public class StaticVariable
{
static int i;
static int j;
static
{

i=20;
j=50;
}
public static void main(String []args)
{
System.out.println("i value is" +i);
System.out.println("j value is" +j);
System.out.println("main method ended");
}
}
