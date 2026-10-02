import java.util.Arrays;

public class FirstUniqueChar {
    
    public static int findIndex(String s)
    {
        char arr[] = s.toCharArray();
        int freq[] = new int[26];
 
        for(char ch : arr)
        {
                freq[ch-'a']++;
        }
     System.out.println(Arrays.toString(freq));

        for(int i=0 ; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(freq[ch-'a'] == 1)
                return i ; 
        }
        return -1;
    }
    public static void main(String[] args) {
        
        // String s = "loveleetcode";
        String s = "aabb";
        // String s = "abcdfac";

        System.out.println(findIndex(s));
    }
}
