class Hi
{
    public static void main(String[] args) {
        
        int a[]={10,3};
        try{
            // System.out.println(10/0);
            System.out.println(a[6]);
        }
        catch(Throwable t)
        {
            System.out.println(t.toString());
            System.out.println(t.getMessage());
            t.printStackTrace();
        }
    }
}