import java.util.*;
class New
{
public static void main(String...k)
{
Student ob1=new Student();
ob1.input();
ob1.show();
}
}
class Student
{
int roll,age;
String name;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter roll no.,name and age");
roll=sc.nextInt();
name=sc.next();
age=sc.nextInt();
}
void show()
{
System.out.println("Roll no: "+roll);
System.out.println("Name: "+name);
System.out.println("Age: "+age);
}
}
