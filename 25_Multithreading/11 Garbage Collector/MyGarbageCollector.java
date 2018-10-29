    public class MyGarbageCollector{  
     public void finalize(){System.out.println("object is garbage collected");}  
     public static void main(String args[]){  
      MyGarbageCollector s1=new MyGarbageCollector();  
      MyGarbageCollector s2=new MyGarbageCollector();  
      s1=null;  
      s2=null;  
      System.gc();  
     }  
    }  