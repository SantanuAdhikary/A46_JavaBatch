import java.util.Arrays;

public class Anagram {
    
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        // ! converting into lower case 
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // System.out.println(s1);
        // System.out.println(s2);

        // ! converting into array and sort them

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));

        // ! again converting into string and compare them

        s1 = new String(a);
        s2 = new String(b);

       if(s1.equals(s2))
        System.out.println("it is anagram");
      else
        System.out.println("it is not anagram");
    }
}
