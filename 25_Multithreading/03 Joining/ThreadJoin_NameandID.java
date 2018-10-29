    class ThreadJoin_NameandID extends Thread{  
      public void run(){  
       System.out.println("running...");  
      }  
     public static void main(String args[]){  
      ThreadJoin_NameandID t1=new ThreadJoin_NameandID();  
      ThreadJoin_NameandID t2=new ThreadJoin_NameandID();  
      System.out.println("Name of t1:"+t1.getName());  
      System.out.println("Name of t2:"+t2.getName());  
      System.out.println("id of t1:"+t1.getId());  
      System.out.println("id of t1:"+t2.getId());  
      t1.start();  
      t2.start();  
      
      t1.setName("Rahul Tanwar");  
      System.out.println("After changing name of t1:"+t1.getName());  
     }  
    }  