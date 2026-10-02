public class CountAlphabets {
    
    public static void main(String[] args) {
        String s = "aaabbcccdd";
        int n = s.length();
        String ans = "";
        int count = 1 ; 
        for(int i=1 ; i<s.length();i++)
        {
             if(s.charAt(i) == s.charAt(i-1))
                count++;
            else{
                ans = ans + s.charAt(i-1)+count;
                count = 1;
            }
        }
        ans = ans + s.charAt(n-1)+count;
        System.out.println(ans);
    }
}
