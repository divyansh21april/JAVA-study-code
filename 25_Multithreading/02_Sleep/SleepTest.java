class SleepTest extends Thread

{

public void run()

{

System.out.println("New thread started");

for(int i=0;i<10;i++)

{

System.out.println("Value : "+i);

try

{

sleep(1000);

}
catch(InterruptedException ie)

{}

}
}



public static void main(String...l)

{

SleepTest ob = new SleepTest();

SleepTest ob1 = new SleepTest();

ob.start();

ob1.start();

}
}