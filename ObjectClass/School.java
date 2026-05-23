

class School
{

    String sub1 ;
    String sub2 ;

    School(String sub1 , String sub2)
    {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    @Override
    public String toString()
    {
        return "subject1 : "+sub1 + " subject2 : "+sub2;
    }

    @Override
    protected void finalize()  {

        System.out.println("object deleted");
    }

    public static void main(String args[])
    {
            School s = new School("mathematics","chemistry");
            s = null;
            System.out.println(s);

            System.gc();

         
    }
}