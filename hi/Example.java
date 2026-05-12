
class Parent
{
    
    void sleep()
    {
        System.out.println("parent is sleeping");
    }
}

class Child extends Parent{

    @Override
    void sleep( )
    {
        System.out.println("child is sleeping");
    }
}

class Example
{
    public static void main(String[] args) {
        

         Parent p = new Parent();
         p.sleep();

         Parent p1 = new Child();
         p1.sleep();

         Child c = (Child) p1;
         c.sleep();

      
    }
}