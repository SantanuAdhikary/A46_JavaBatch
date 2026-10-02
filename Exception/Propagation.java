public class Propagation {


    public static void m1() 
    {
        
        System.out.println(10/0);
        System.out.println("i am m1");

        
    }
    public static void m2() 
    {
        System.out.println("i am m2");
        m1();
        
    }
    public static void m3() 
    {

        System.out.println("i am m3");
        m2();
    }
    public static void main(String[] args) {
       
        try{

            m3();
        }
        catch(Exception e)
        {
                System.out.println("exception is handled");
        }
    }
}
