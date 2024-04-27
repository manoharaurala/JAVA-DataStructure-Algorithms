import java.util.*;
public class AthlargestSubArray {

    public static ArrayList<Integer> solve(int A, ArrayList<Integer> B) {

        PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0;i<A-1;i++){
            minHeap.add(B.get(i));
            result.add(-1);
        }

        minHeap.add(B.get(A-1));
        result.add(minHeap.peek());

        for(int i=A;i<B.size();i++){
            int temp=B.get(i);
            if(minHeap.peek()<temp){
                minHeap.add(temp);
                minHeap.remove();
            }

            result.add(minHeap.peek());
        }


        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(15, 20, 99, 1));
        int B=2;

        ArrayList<Integer>res=solve(B,A);
        System.out.println("res = " + res);


    }
}
