
class Person 
{
    void eat()
    {
        System.out.println("i can eat");
    }
    void sleep()
    {
        System.out.println("i can sleep");
    }
}
class Emp extends Person
{

    @Override
    public String toString()
    {
        return "my name is santanu";
    }
    public static void main(String[] args) {
        
       Emp e1 = new Emp();


       System.out.println(e1);
       System.out.println(e1.toString());

       e1.eat();
       e1.sleep();
      
       
    }
}