

// !  Checked Custom Exception 

class NotStudying extends Exception
{
      NotStudying(String msg)
      {
        super(msg);
      }
}

public class Custom1{


    public static void school() throws NotStudying
    {
        int marks = 30 ;

        if(marks >= 50)
            System.out.println("very good.. keep it up");
        else 
            throw new NotStudying("very bad");
    }
    public static void main(String[] args) {
        
        try{

            school();
        }
        catch(NotStudying n)
        {
           System.out.println(n);
           System.out.println(n.getMessage());
           System.out.println("NotStuding Exception is handled");
        }
    }
}