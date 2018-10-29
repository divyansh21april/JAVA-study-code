package p1;

import java.util.*;
import p2.*;

class Demo implements My1,My2
{
int x,y,z;
public void show()
{
System.out.print("the sum is"+z);
}

public void input()
{Scanner sc=new Scanner (System.in);
System.out.print("Enter the 2 nos:");
x=sc.nextInt();
y=sc.nextInt();
}

public void caluclate()
{
z=x+y;
}
public static void main(String...k)
{
Demo d=new Demo();
d.input();
d.caluclate();
d.show();
}
}
