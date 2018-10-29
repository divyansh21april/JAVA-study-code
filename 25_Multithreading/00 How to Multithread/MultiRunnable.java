class MultiRunnable implements Runnable

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

MultiRunnable ob = new MultiRunnable();

MultiRunnable ob1 = new MultiRunnable();

Thread t = new Thread(ob);

Thread t1 = new Thread(ob1);

t.start();

t1.start();

}
}