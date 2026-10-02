
import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        
        String s = "we love java";

        String arr[] = s.split(" ");
        String ans = "";

        System.out.println(Arrays.toString(arr));

        for(String word : arr)
        {
            String rev ="";
            for(int i=word.length()-1 ; i>=0 ; i--)
            {
                rev += word.charAt(i);
            }
            ans += rev+" ";
        }

        System.out.println(ans.trim());
       
    }
}
