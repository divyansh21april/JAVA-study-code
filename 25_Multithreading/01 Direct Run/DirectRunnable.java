class DirectRunnable implements Runnable

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

DirectRunnable ob = new DirectRunnable();

DirectRunnable ob1 = new DirectRunnable();

ob.run();

ob1.run();

}
}