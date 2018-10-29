package my;



class HowTo
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

HowTo ob = new HowTo();
ob.input();
ob.show();
}

}