@FunctionalInterface
interface Operation
{
    void multiply();
}

interface Operation2
{
    void division(int a , int b);
}

interface Operation3 {

    int addition(int a , int b);
}

public class Lamda {
    public static void main(String[] args) {
        
        // ! lamda expression without parameter

        Operation op = ()->{

            System.out.println("muliply is "+(2*4));
        };
        op.multiply();


        // ! lamda expression with parameter

        Operation2 op2 = ( a ,  b)->{

             System.out.println("division is : "+(a/b));
        };
        op2.division(20, 5);

        // ! lamda expression with return type

        Operation3 op3 = (a,b)-> a + b ;

      System.out.println("addition is : "+op3.addition(30,60))  ;
    }
}
