public class Rectangle
{
int length;
int width;
int area;
void insert(int l,int w)
{
length=l;
width=w;
}
void display()
{

System.out.println(area=length*width);
}

public static void main(String args[])
{
Rectangle r1=new Rectangle();

r1.insert(5,5);
r1.display();
}
}
