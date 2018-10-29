class MultiThread extends Thread

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

MultiThread ob = new MultiThread();

MultiThread ob1 = new MultiThread();

ob.start();

ob1.start();

}
}