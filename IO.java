import java.io.*;
class IO
{
public static void main(String args[]) throws IOException
{
int i;
	String a=new String("Hello");
	byte b[]=a.getBytes();
	FileOutputStream f=new FileOutputStream("abc.txt");
	f.write(b);
	FileInputStream x=new FileInputStream("abc.txt");
	while((i=x.read())!=-1)
	{
		System.out.print((char)i);
	}
	}
}