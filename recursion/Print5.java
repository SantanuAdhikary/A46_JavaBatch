class Print5
{
    public static void display(int n)
    {
        //! base case 
           if(n==0) return ;

          System.out.println(n);
          display(n - 1);         //! recursive call
    }
    public static void main(String args[])
    {
        System.out.println("start");
        display(5);
        System.out.println("end");
    }
}