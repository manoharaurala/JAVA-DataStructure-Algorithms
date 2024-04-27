import java.util.*;
import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleinHistogram {
    public static int largestRectangleArea(ArrayList<Integer> A) {
        ArrayList<Integer> NSL=calculate_NSL(A);
        ArrayList<Integer> NSR=calculate_NSR(A);
        int ans=Integer.MIN_VALUE;

        int n=A.size();
        for(int i=0;i<n;i++){

            int left=NSL.get(i);
            int right=NSR.get(i);
            ans=Math.max(ans,A.get(i)*(right-left-1));

        }

        return ans;


    }

    public static ArrayList<Integer> calculate_NSL(ArrayList<Integer>A){
        int n=A.size();
        ArrayList<Integer> ret=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            ret.add(-1);
        }

        Stack<Integer> stk=new Stack<Integer>();

        for(int i=0;i<n;i++){

            while(!stk.isEmpty() && A.get(stk.peek())>=A.get(i)){
                stk.pop();
            }
            if(!stk.isEmpty()){
                ret.set(i,stk.peek());
            }
            stk.push(i);
        }

        return ret;



    }

    public static ArrayList<Integer> calculate_NSR(ArrayList<Integer>A){

        int n=A.size();
        ArrayList<Integer> ret=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            ret.add(-1);
        }
        Stack<Integer> stk=new Stack<Integer>();

        for(int i=n-1;i>=0;i--){

            while(!stk.isEmpty() && A.get(stk.peek())>=A.get(i)){
                stk.pop();
            }
            if(!stk.isEmpty()){
                ret.set(i,stk.peek());
            }
            stk.push(i);
        }

        return ret;

    }

    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<Integer>(Arrays.asList(47,69,67,97,86,34,98,16,65,95,66,69,18,1,99,56,35,9,48,72,49,47,1,72,87,52,13,23,95,55,21,92,36,88,48,39,84,16,15,65,7,58,2,21,54,2,71,92,96,100,28,31,24,10,94,5,81,80,43,35,67,33,39,81,69,12,66,87,86,11,49,94,38,44,72,44,18,97,23,11,30,72,51,61,56,41,30,71,12,44,81,43,43,27));

        int ans=largestRectangleArea(arr);
        System.out.println(ans);

    }
}
