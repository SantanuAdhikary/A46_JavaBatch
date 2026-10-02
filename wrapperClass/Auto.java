public class Auto {
    public static void main(String[] args) {
        

        // ! auto boxing 

        int a = 10 ;

        Integer ob1 = a;
        System.out.println(ob1.toString());
        
        byte b = 20 ; 
        Byte ob2 = b ;
        System.out.println(ob2.toString());

        // ! auto unboxing 

        byte c = ob2;
        System.out.println(c);
    }
}
