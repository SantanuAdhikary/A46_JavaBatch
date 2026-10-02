public class Program1 {
    
    public static void main(String[] args) {
        

        // ! 1. how to know the length of String

        String msg = "RCB has won the IPL";

       int len = msg.length();

       System.out.println("length of the msg is "+len);

    //    !  2.  charAt()


    System.out.println(msg.charAt(5));


    // ! 3. indexOf()

    System.out.println(msg.indexOf('a'));
    System.out.println(msg.indexOf('h'));

    // ! 4. lastIndexOf()

    System.out.println(msg.lastIndexOf('h'));


    // ! 5. toUpperCase()

    String greet = "Good Morning";

    String upper = greet.toUpperCase();

    System.out.println(upper);
    System.out.println(greet);

    // ! 6. toLowerCase()

    String lower = greet.toLowerCase();
    System.out.println(lower);
    System.out.println(greet);


    char ch = greet.charAt(2);
    System.out.println(ch);



    String str1 = "hello";
    str1 = str1.toUpperCase();
    System.out.println(str1);

    }
}
