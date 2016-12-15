public class ArmstrongExample
{
public static void main(String []args)
{
int Number=153;
int rem=0;
int c=0;
int temp=Number;
while(Number>0)
{
rem=Number%10;
c=c+(rem*rem*rem);
Number=Number/10;
}
if(c==temp)
{
System.out.println("number is armstrong");
}
else
{
System.out.println("number is not armstrong");
}
}
}
