import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            }
            else {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        ValidParentheses cls = new ValidParentheses();

        if(cls.isValid(s)){
            System.out.println("the string is a valid parentheses");
        }else{
            System.out.println("The string is not a valid parentheses");
        }
    }
}