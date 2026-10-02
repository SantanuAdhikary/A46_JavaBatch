class Wrapper1
{
    public static void main(String[] args) {
        
        int a = 20 ; 
        System.out.println("a is : "+a);

        // ! Boxing  for int
        System.out.println("------------boxing for int---------");
        
        Integer ob1 = Integer.valueOf(a);
        System.out.println(ob1);
        System.out.println(ob1.toString());
        
        // ! Boxing  for byte
        System.out.println("------------boxing for byte---------");
        
        byte b = 10 ;
        System.out.println(b);
        
        Byte ob2 = Byte.valueOf(b);
        System.out.println(ob2);
        System.out.println(ob2.toString());

        // ! Boxing  for short
        System.out.println("------------boxing for short---------");
        
        short c = 30 ;
        System.out.println(c);
        
        Short ob3 = Short.valueOf(c);
        System.out.println(ob3);
        
        
        // ! UnBoxing  for int
        System.out.println("------------boxing for int---------");


        int x = 100;
        Integer ob4 = Integer.valueOf(x); // boxing

        int x2 = ob4.intValue();   // unboxing

       System.out.println("x2 is : "+x2);


       Integer ob9 = 10 ;

       int z = ob9.intValue();

       System.out.println(z);
        
        
    }
}