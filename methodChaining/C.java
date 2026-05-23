
@FunctionalInterface
interface A {
   
    int m1(int a , int b);
}



public class C {
    
    public static void main(String[] args) {
        
        // A ob = new A(){
        //     @Override
        //     public void m1()
        //     {
        //         System.out.println("i am m1");
        //     }
        // };

        // ob.m1();


        A ob = (a, b)-> a + b ;

       System.out.println( ob.m1(10,30));
    }
}
