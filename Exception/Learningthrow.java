
import java.util.Scanner;
public class Learningthrow {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        
        System.out.println("start");
       
        int age = 9;
            if(age>21)
                System.out.println("you can ride bike");
            else
                throw new ArrayIndexOutOfBoundsException("you can't ride");    
        
        

        System.out.println("end");

    }
}
