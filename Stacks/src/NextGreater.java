import java.util.*;
public class NextGreater {

    public static ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        int n=A.size();

        ArrayList<Integer> ret=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();

        for(int i=0;i<n;i++){
            ret.add(-1);
        }
        //Collections.fill(ret,-1);

        for(int i=n-1;i>=0;i--){

            int temp=A.get(i);

            while(!stack.isEmpty() && stack.peek()<=temp){

                stack.pop();
            }

            if(!stack.isEmpty()){
                ret.set(i,stack.peek());

            }

            stack.push(temp);


        }




        return ret;
    }
    public static void main(String[] args) {

        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(39,27,11,4,24,32,32,1));
        ArrayList<Integer>ret=nextGreater(arr);
        System.out.println(ret);

    }
}
