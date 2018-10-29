package my;


interface My1
{
void input();
}

interface My2
{

void show();
}


class Mistake1
 implements My1, My2
{int x;

public void input()
{
x=90;
}

public void show()
{
System.out.println("x is "+x);
}

public static void main(String...l)

{

Mistake1 ob = new Mistake1();
ob.input();
ob.show();
}

}