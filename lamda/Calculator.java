interface Calculate
{
    void add();
}

public class Calculator {
    
    public static void main(String[] args) {
        
        // class A implements Calculate{
        //     @Override
        //     public void add()
        //     {
        //         System.out.println("i am add method");
        //     }
        // }
        
        // Calculate c = new A();
        // c.add();


        // ! Anonymous class 
        
        Calculate c = new Calculate(){

              @Override 
              public void add()
              {
                System.out.println("this is add method");
              }
        };

        c.add();
    }
}


