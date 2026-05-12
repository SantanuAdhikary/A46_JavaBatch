public class A {
    int x ;
    A(int x)
    {
        this.x = x;
    }

    @Override
    public boolean equals(Object ob)
    {
            A a1 = (A) ob;
            return this.x ==  a1.x;
    }

  
    public static void main(String[] args) {
        
        A ob = new A(10);
        A ob1 = new A(20);
        A ob2 = new A(10);

        System.out.println(ob == ob1);
        System.out.println(ob == ob2);

         System.out.println("----------------equals-----------------");
        System.out.println(ob.equals(ob2));
        System.out.println(ob.equals(ob1));
    }
}
