public class RemoveDuplicate {
    
    public static void main(String[] args) {
        
        String s = "santanu";
        String ans = "";

       for(int i=0 ; i<s.length();i++)
       {
          char ch = s.charAt(i);

          if(ans.indexOf(ch) == -1)
            ans = ans + ch;
       }

       System.out.println(ans);
    }
}
