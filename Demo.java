public class Demo
{
final static short x=2;
public static int y=0;
public static void main(String...k)
{
for(int z=0;z<3;z++)
{
switch(z)
{
case x: x=x+1;
break;
case x-1:System.out.print("x is"+x);
break;
default:Syste,.out.print("y is"+y);
}
}
}
}