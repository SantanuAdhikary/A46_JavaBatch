public class countFrequency {
    public static void main(String[] args) {
        
        String s = "hello world";

        for(int i=0 ; i<s.length();i++)
        {
            char ch = s.charAt(i);
            int count = 1 ; 

            // remove space 

            if(ch == ' ') continue;

            // remove duplicate 

            if(s.indexOf(ch) != i) continue;

            for(int j=i+1 ; j<s.length();j++)
            {
                if(ch == s.charAt(j))
                    count++;
            }
            System.out.println(ch +" --> "+count);
        }
    }
}
