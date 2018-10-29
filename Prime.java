import java.util.*;
class Prime
{
public static void main(String...k)
{
int a,i,j,f=0;
Scanner cin=new Scanner(System.in);
System.out.print("Enter a number");
a=cin.nextInt();
for(i=2;i<=a;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
{
f=1;
break;
}
else
f=0;
}
if(f==0)
System.out.println(i);
}
}
}