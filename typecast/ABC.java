class TypeCastingDemo
{
    public static void main(String[] args)
    {
       
        // WIDENING TYPE CASTING (Implicit)
   

        byte b = 10;
        short s = b;          // byte → short
        int i = s;            // short → int
        long l = i;           // int → long
        float f = l;          // long → float
        double d = f;         // float → double

        System.out.println("Widening Casting:");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);


        // NARROWING TYPE CASTING (Explicit)

        double d1 = 99.99;
        float f1 = (float) d1;    // double → float
        long l1 = (long) f1;      // float → long
        int i1 = (int) l1;        // long → int
        short s1 = (short) i1;    // int → short
        byte b1 = (byte) s1;      // short → byte

        System.out.println("\nNarrowing Casting:");
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(s1);
        System.out.println(b1);
       
    }
}
