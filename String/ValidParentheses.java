import java.util.Stack;

class ValidParentheses
{

    public static boolean isValid(String s)
    {
        char arr[] = s.toCharArray();

        Stack st = new Stack();  //! declaration of stack

        for(char ch : arr)
        {
            if(ch=='(' || ch=='[' || ch=='{')
                st.push(ch);    //! add element in stack
            else{
                char top = (char) st.pop();  //! remove element in stack
                
                if(ch==')'  && top!='(') 
                    return false;

                if(ch=='}' && top!='{')
                    return false;

                if(ch==']' && top!='[')
                    return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        
        String s = "([]{)}";

        System.out.println(isValid(s));
    }
}