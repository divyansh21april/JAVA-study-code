import java.util.*;
class Matrix
{
public static void main(String...k)
{
int t=0,i,j,a,b,arr[][];
Scanner cin=new Scanner(System.in);
System.out.println("Enter Size Matrix");
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
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
t=t+arr[i][j];
}
}
System.out.print("Sum of matrix is"+ t);
}
}