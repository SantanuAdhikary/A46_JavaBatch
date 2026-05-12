public class Power {
    
    public static int power(int b , int p)
    {
        int ans = 1;
        for(int i=1 ; i<=p ; i++)
        {
            ans = ans * b;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        System.out.println( power(2, 5));
    }
}
