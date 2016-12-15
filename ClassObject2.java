public class ClassObject2
{
int rollno;
String name;

void insertdata(int r, String s)
{
rollno=r;
name=s;
}
void display()
{
System.out.println(rollno+" "+name);
}

public static void main(String []args)
{
ClassObject2 s1=new ClassObject2();
//ClassObject2 s2=new ClassObject2();
s1.insertdata(7,"vaibhav");
//s1.insertdata(8,"krishna");
//s1.display();
s1.display();
}
}
