public class CaseChange {
    public static void main(String[] args) {
 
        String s = "JaVaScRiPt";
        String ans = "";
        for(int i=0 ; i<s.length();i++)
            {
                char ch = s.charAt(i);
                
                if(ch>='A' && ch<='Z')
                    ch += 32;
                else if(ch>='a' && ch<='z')
                    ch -=32;
                
                ans += ch;
            }    
        System.out.println(s);
        System.out.println(ans);
       
    }
}
