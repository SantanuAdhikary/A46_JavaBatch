public class Handle1 {
  public static void main(String[] args) {
    
        int a = 30 , b = 0 ;
        System.out.println("start");
        
        try{
            System.out.println(a+b);  // 30
            System.out.println(a/b);
            System.out.println(a-b);
            System.out.println(a*b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("your problem I have handled");
        }
        System.out.println("end");

  }   
}
