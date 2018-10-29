    class ThreadJoin1 extends Thread{  
     public void run(){  
      for(int i=1;i<=5;i++){  
       try{  
        Thread.sleep(500);  
       }catch(Exception e){System.out.println(e);}  
      System.out.println(i);  
      }  
     }  
    public static void main(String args[]){  
     ThreadJoin1 t1=new ThreadJoin1();  
     ThreadJoin1 t2=new ThreadJoin1();  
     ThreadJoin1 t3=new ThreadJoin1();  
     t1.start();  
     try{  
      t1.join();  
     }catch(Exception e){System.out.println(e);}  
     
     t2.start();  
     t3.start();  
     }  
    }  