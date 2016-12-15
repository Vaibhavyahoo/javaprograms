import java.util.Scanner;

public class repeat
{
public static void main(String []args)
{
int rem,srem,result,loc,flag=0;
int []arr=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("emter number");
int Number=sc.nextInt();
rem=0;
//rep=0;
result=0;
if(Number<0)
{
Number=(Number*-1);
flag=1;
}
while(Number>0)
{
	rem=Number%10;
	arr[10-rem]++;
	Number=Number/10;

}
for(int i=0;i<10;i++){
if(arr[i]>0){
        result=(result*10)+(10-i);
       	}
}
if(flag==1){
result=result*(-1);
}
System.out.println("result :"+result);
}
}
