public class palondra
{
public static void main(String []args)
{
int r=0,sum=0;
int n=1551;
int temp=n;
while(n>0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(sum==temp)
{
System.out.println("Number is paralondra");
}
else
{
System.out.println("Number is not paralndra");
}
}
}
