// import java.util.Arrays;

public class SwapVowels {
    
    public static boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;

        return false;
    }
    public static void main(String[] args) {
        
        String str = "leetcode";
        int s =0 , e = str.length()-1;
        char a[]=str.toCharArray();
        while(s<e)
        {
            if(!isVowel(a[s]))
                s++;
            else if(!isVowel(a[e]))
                e--;
            else
            {
                char temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }

        System.out.println(new String(a));
    }
}
