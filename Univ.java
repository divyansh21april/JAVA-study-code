package p1;
import java.util.*;
public class Univ implements A1,A2
{
Scanner sc=new Scanner(System.in);
public float bal,with,dep,res;
public char ans='y';
public void enterbalance()
{
int f=0;
System.out.println("Enter your account balance to proceed further");
while (f==0)
{
try
{
bal=sc.nextFloat();
if(bal<0)
{
f=0;
throw new ArithmeticException("Invalid input");
}
else 
{
f=1;
}
}
catch(ArithmeticException c)
{
System.out.println(c);
}
}
}
public void deposit()
{
while (ans=='y' || ans=='Y')
{
System.out.println("Enter amount to be deposited");
dep=sc.nextFloat();
try
{
if(dep<0)
{ 
throw new ArithmeticException("Invalid Input");
}
else
{
bal=bal+dep;
System.out.println("Transactions Succeccful");
System.out.println("Your new account balance is:"+bal);
}
}
catch(ArithmeticException b)
{
System.out.println(b);
}
System.out.println("Do you again want to input?");
System.out.println("Enter y or Y for Yes ");
ans=sc.next().charAt(0);
}
}
public void withdrawl()
{
while (ans=='y' || ans=='Y')
{
System.out.println("Enter amount to withdraw");
with=sc.nextFloat();
try
{
if(with>bal)
{
throw new ArithmeticException("Amount greater than present balance");
}
else if(with<0)
{
throw new ArithmeticException("Invalid Input");
}
else
{
System.out.println("Transation Succeccful");
bal=bal-with;
System.out.println("Your remaining Balance is:"+bal);
}
}
catch(ArithmeticException a)
{
System.out.println(a);
}
System.out.println("Do you again want to input?");
System.out.println("Enter y or Y for Yes ");
ans=sc.next().charAt(0);
}
System.out.print("Thank You");
}
}