public class Example8 {

    public static void m3() throws Exception
    {
          for(int i=1 ; i<=10;i++)
          {
            System.out.println(i);
            Thread.sleep(1000);
          }
    }
    public static void m2() throws Exception
    {
       m3();
    }
    public static void m1() throws Exception
    {
        m2();
    }
    public static void main(String[] args) {
        
       try{
           m1();
       } 
       catch(Exception e)
       {
         System.out.println("thread exception is handled");
       }

    }
}
