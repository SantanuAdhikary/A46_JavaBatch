import java.util.Arrays;

public class Panagram {

    public static boolean isPanagram(String sentence)
    {

        sentence = sentence.toLowerCase();
        boolean arr[] = new boolean[26];

        for(int i=0 ; i<arr.length;i++)
        {
            arr[i] = false;
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i<sentence.length();i++)
        {
            char ch = sentence.charAt(i);
            if(ch == ' ') continue;

            arr[ch-97] = true;
        }

        System.out.println("---------------------------------------");

        System.out.println(Arrays.toString(arr));


        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i]==false)
                return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        String sentence = "The quick Brown Fox Jumps Over the Lazy Dog";
        
        System.out.println(isPanagram(sentence));

        
    }
}
