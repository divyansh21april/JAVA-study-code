package my;


interface My1
{
void input();
}

interface My2
{

void show();
}



public class Parent implements My1, My2
{
int x;

public void input()
{
x=90;
}

public void show()
{
System.out.println("x is "+x);
}
}


public class Child extends Parent
{

public static void main(String...l)

{

Child ob = new Child();
ob.input();
ob.show();
}

}