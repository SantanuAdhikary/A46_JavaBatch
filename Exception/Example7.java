public class Example7 {
    
    public static void main(String[] args) {
        
        for(int i=1 ; i<=10 ; i++)
        {
            System.out.println(i);
           
        }

        try{
            
            Class.forName("Example8");
        }
        catch(Exception e)
        {
            System.out.println("classnot found exception is handled");
        }
    }
}
