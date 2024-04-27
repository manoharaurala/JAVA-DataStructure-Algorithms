import java.util.*;
public class ReversingElementsOfQueue {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Queue<Integer> q=new ArrayDeque<Integer>();
        ArrayList<Integer>ret=new ArrayList<Integer>();

        for(int num:A){
            q.add(num);
        }

        Stack<Integer>stack=new Stack<Integer>();
        for(int i=0;i<B;i++){
            stack.push(q.peek());
            q.remove();
        }

        while (!stack.isEmpty()){
            ret.add(stack.peek());
            stack.pop();
        }

        while (!q.isEmpty()){
            ret.add(q.peek());
            q.remove();
        }

        return ret;


    }

    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int B=3;
        ArrayList<Integer>ret=solve(arrayList,B);
        System.out.println("ret = " + ret);
    }
}
