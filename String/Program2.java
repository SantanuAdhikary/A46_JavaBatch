import java.util.Scanner;
public class Program2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      
        System.out.print("enter your email : ");
        String email = sc.nextLine();

        System.out.print("enter your email once more : ");
        String email2 = sc.nextLine();

        if(email.equals(email2))
            System.out.println("both email is same");
        else
            System.out.println("both are not same");
    }
}
