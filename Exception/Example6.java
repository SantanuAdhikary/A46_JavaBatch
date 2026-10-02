class Example6
{
    public static void main(String[] args) {
        

        int a = 10 , b = 0 ;
        System.out.println("start");

        try{
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a/b);
            System.out.println(a*b);
        }
        catch(Throwable e)
        {
            System.out.println("Throwable exception is handled");
        }
        catch(Exception e)
        {
            System.out.println("exception is handled");
        }
        catch(RuntimeException e)
        {
            System.out.println("RuntimeException is handled");
        }
        catch(ArithmeticException e)
        {
             System.out.println("arithmetic exception is handled");
        }
        finally
        {
            System.out.println("i am finally block");
        }
        System.out.println("end");
    }
}