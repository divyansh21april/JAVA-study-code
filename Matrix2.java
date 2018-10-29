import java.util.*;
class Matrix2
{
public static void main(String...k)
{
int i,j,arr[][],a,b,max=0,min=0;
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
System.out.println("the maximum and minimum of the following matrix is ");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
min=arr[1][1];
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
if(arr[i][j]>max)
{
max=arr[i][j];
}
if(arr[i][j]<min)
{
min=arr[i][j];
}
}
}
System.out.println("Maximun="+max+"\nMininum="+min);
}
}