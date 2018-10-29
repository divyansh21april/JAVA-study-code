    class CurrentThread extends Thread{  
     public void run(){  
      System.out.println(Thread.currentThread().getName());  
     }  
      
     public static void main(String args[]){  
      CurrentThread t1=new CurrentThread();  
      CurrentThread t2=new CurrentThread();  
      
      t1.start();  
System.out.println("Printing name from psvm"+t1.getName());
      t2.start();  
     }  
    }  