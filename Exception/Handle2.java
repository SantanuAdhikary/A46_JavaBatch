public class Handle2 {
    
    public static void main(String[] args) {
        
        System.out.println("start");

        int arr[]={2,3,4,5,6};
        String s = null ;

        // ! first try and catch block
    
        try
        {
            System.out.println(30/0);

        }
        catch(ArithmeticException e)
        {
              System.out.println("arithmetic exception is handled");
        }
    
        // ! 2nd try and catch block

        try{
            System.out.println(s.toUpperCase());
        }
        catch(NullPointerException e)
        {
           System.out.println("nullpointer exception is handled");
        }
       

        // ! 3rd try and catch 

        try{

            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println("ArrayIndexOutOfBoundsException is handled");
        }
        System.out.println("end");

    }
}
