import java.util.*;
public class EvalPostFix {

    public static int evalRPN(ArrayList<String> A) {
        int n=A.size();

        Stack<String> stk=new Stack<String>();
        int ans=0;

        for(int i=0;i<n;i++){

            String str=A.get(i);

            if(str.equals("+") || str.equals("-") || str.equals("*" )|| str.equals("/")){

                int second=Integer.parseInt(stk.pop());

                int first=Integer.parseInt(stk.pop());

                if(str.equals("+")) ans=first+second;
                if(str.equals("-")) ans=first-second;
                if(str.equals("*" )) ans=first*second;
                if(str.equals("/")) ans=first/second;

                String add=ans+"";
                stk.push(add);
            }

            else{
                stk.push(str);
            }
        }

        //System.out.print(stk);

        //return 5;

        return Integer.parseInt(stk.pop());
    }

}
