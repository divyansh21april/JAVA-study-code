package my;



class Mistake2
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

Mistake2 ob = new Mistake2();
ob.input();
ob.show();
}

}