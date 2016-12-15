class SrSamba
{
String car="Honda";
int house=2;
int amount=10000;

void property()
{
System.out.println("cars are" +car);
System.out.println("no of house is" +house);
System.out.println("amont is" +amount);
}
}


class Samba extends SrSamba
{

}
class JrSamba extends Samba
{

}


public class Inheritance1
{
public static void main(String []args)
{
System.out.println("main method satrted");
System.out.println("property of jr samba is");
JrSamba jr=new JrSamba();
jr.property();
System.out.println("***end***");
System.out.println("property of samba is");
Samba s1=new Samba();
s1.property();
System.out.println("***end***");
System.out.println("property of senior samba is");
SrSamba sr=new SrSamba();
sr.property();
System.out.println("***ended***");
}
}
