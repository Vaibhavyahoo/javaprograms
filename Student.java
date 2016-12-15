public class Student
{
String name;
int id;
 Student(int i,String n)
{
name=n;
id=i;
}
Student()
{

}
void display()
{
System.out.println(id+"  "+name);
}
public static void main(String []args)
{
Student s1=new Student(1,"vaibhav");
Student s2=new Student();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}}

