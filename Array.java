import java.util.*;
class Array
{
public static void main(String...k)
{
int arr[],i,a;
Scanner cin=new Scanner(System.in);
System.out.print("Enter size of array");
a=cin.nextInt();
arr=new int[a];
for(i=0;i<a;i++)
{
System.out.println("Enter Elements of array");
arr[i]=cin.nextInt();
} 
for(i=0;i<a;i++)
{
System.out.println("The "+(i+1)+" Element of Array is "+arr[i]);
}
}
}