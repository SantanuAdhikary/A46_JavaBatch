public class handle4 {
    
    public static void main(String[] args) {
        
        System.out.println("start");
        int a[] ={1,2,3,4};
        String s = null;
        try{
            System.out.println(10+5);
            System.out.println(10-5);
            System.out.println(a[2]);
            // System.out.println(a[10]);
            // System.out.println(s.toUpperCase());
            System.out.println(30/0);
        }
        catch(Exception e)
        {
               System.out.println("exception is handled");
        }
        System.out.println("end");
    }
}
