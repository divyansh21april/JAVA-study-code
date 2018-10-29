    public class RuntimeShutDown1{  
     public static void main(String args[])throws Exception{  
      Runtime.getRuntime().exec("shutdown -s -t 0");  
     }  
    }  