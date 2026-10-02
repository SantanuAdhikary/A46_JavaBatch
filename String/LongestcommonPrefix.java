import java.util.Arrays;

class LongestCommonPrefix
{
    public static void main(String[] args) {
        
        String arr[] = {"flower","flow","flight"};
        System.out.println(Arrays.toString(arr));

        String prefix = arr[0];

        for(String word : arr)
        {
            int i=0 , j =0  ; 
            while(i<prefix.length() && j<word.length() )
            {
                if(prefix.charAt(i) == word.charAt(j))
                {
                    i++;
                    j++;
                }
                else
                    break;      
            }
            prefix = prefix.substring(0,j);
        }

        System.out.println("common prefix is "+prefix);
    }
}