
public class Palindrome2 { 
    public static boolean isPalindrome(String s)
    {
        char arr[] = s.toCharArray();
        int i=0 , j = arr.length-1;
        while(i<j)
        {
            if(arr[i] != arr[j])
                return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        System.out.println(isPalindrome("malayalam"));
        System.out.println(isPalindrome("malayalax"));
    }
}
