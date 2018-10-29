import java.util.*;
class Matrix4
{
public static void main(String...k)
{
int i,j,arr[][],a,b,sum=0;
Scanner cin=new Scanner(System.in);
System.out.print("Enter size of matrix");
a=cin.nextInt();
b=cin.nextInt();
arr=new int[a][b];
System.out.print("Enter the elements of matrix");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
arr[i][j]=cin.nextInt(); 
System.out.println("Enter next element");
}
}
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
System.out.println("The odd elements of matrix are");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
if(arr[i][j]%2!=0)
{
System.out.println(arr[i][j]);
}
}
}
}
}
