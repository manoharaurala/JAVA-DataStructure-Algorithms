import java.util.Arrays;
import java.util.Stack;

public class InFIXToPostFIX {

    public static String solve(String A) {
        StringBuilder stringBuilder=new StringBuilder();
        Stack<Character>stack=new Stack<Character>();

        int n=A.length();

        for(int i=0;i<n;i++){
            char ch=A.charAt(i);

            if(isOperand(ch)){
                stringBuilder.append(ch);

            }

            else if(ch=='('){
                stack.push(ch);

            }
            else if (ch==')') {

                while(!(stack.isEmpty() )&& stack.peek()!='('){
                    stringBuilder.append(stack.peek());
                    stack.pop();
                }

                stack.pop();

            }

            else {

                while (!stack.isEmpty() && priority(ch) <= priority(stack.peek())) {

                    stringBuilder.append(stack.peek());
                    stack.pop();
                }

                stack.push(ch);
            }

        }

        while (!stack.isEmpty()){
            stringBuilder.append(stack.peek());
            stack.pop();

        }

        return stringBuilder.toString();

    }

    private static int priority(char ch) {

        if(ch=='+' || ch=='-') return 1;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='^') return 3;

        return 0;

    }

    private static boolean isOperand(char ch) {

        if(ch>='a' && ch<='z') return true;

        return false;
    }

    public static void main(String[] args) {
        String a="a+b*(c^d-e)^(f+g*h)-i";
        String ans=solve(a);

        System.out.println("ans = " + ans);

    }
}
