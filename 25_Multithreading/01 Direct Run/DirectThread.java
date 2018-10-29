class DirectThread extends Thread
{
public void run()
{
System.out.println("New thread started");
for(int i=0;i<10;i++)
{
System.out.println("Value : "+i);
}
}

public static void main(String...l)
{
DirectThread ob = new DirectThread();
DirectThread ob1 = new DirectThread();
ob.run();
ob1.run();
}
}