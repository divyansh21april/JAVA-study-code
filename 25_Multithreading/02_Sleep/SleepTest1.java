class SleepTest1 extends Thread

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

SleepTest1 ob = new SleepTest1();

SleepTest1 ob1 = new SleepTest1();

ob.start();

try

{

sleep(1000);

}

catch(InterruptedException ie)
{}

ob1.start();
}
}