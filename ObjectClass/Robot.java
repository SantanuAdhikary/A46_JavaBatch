public class Robot implements Cloneable {
    
    String name ;

    Robot(String name)
    {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
          return super.clone();
    }

    @Override
    public String toString()
    {
        return "robot name : "+name;
    }

    public static void main(String[] args) {
        
        Robot r1 = new Robot("chitti");
        System.out.println(r1);

        try{

            Robot r2  = (Robot)  r1.clone();
            System.out.println(r2);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
