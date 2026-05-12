public class Sum {  

    public static void sum(int i , int n , int add)
    {
        if(i>n)
        {
            System.out.println("sum is "+add);
            return;
        }

        sum(i+1,n,add);
    }
    public static void main(String[] args) {
       
        sum(1,10,0);
    }
}
