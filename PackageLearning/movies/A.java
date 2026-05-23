package movies;

public class A {
    
    public int x = 10 ;

    protected int y = 20 ;

    int z = 30;

    private int w = 40;
}

class D
{
    A ob4 = new A();

    int a1 = ob4.x;
    int a2 = ob4.y;
    int a3 = ob4.z;
    // int a4 = ob4.w;
}
