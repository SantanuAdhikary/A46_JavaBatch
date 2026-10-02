import java.util.Arrays;

class Program3
{
    public static void main(String[] args) {
        
        char charArr[] = {'s','a','n','t','a','n','u'};
        String name = new String(charArr);

        // System.out.println(name);

        String str1 = "hello";
        String str2 = "HeLlo";

        System.out.println(str1.equalsIgnoreCase(str2));

        char arr[] = str1.toCharArray();
        System.out.println(Arrays.toString(arr)); 


    }
}