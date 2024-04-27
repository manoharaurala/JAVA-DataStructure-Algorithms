import java.util.*;
public class SlidingWindow {

    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ret=new ArrayList<Integer>();
        ArrayDeque<Integer> deque=new ArrayDeque<Integer>();

        int n=A.size();
        int max=A.get(0);
        for(int num:A){
            if(num>max) max=num;
        }

        if(B>n){
            ret.add(max);
            return ret;
        }


        for(int i=0;i<B;i++){
            int temp=A.get(i);

            while (!deque.isEmpty() && A.get(deque.getLast())<temp){
                deque.removeLast();

            }
            deque.addLast(i);
        }

        ret.add(A.get(deque.peek()));

        for(int i=B;i<n;i++){
            int temp=A.get(i);

            while (!deque.isEmpty() && A.get(deque.getLast())<temp){
                deque.removeLast();

            }

            if(!deque.isEmpty() && deque.peek()<=i-B){
                deque.removeFirst();
            }

            deque.addLast(i);

            ret.add(A.get(deque.peek()));

        }

        return ret;


    }

    public static void main(String[] args) {

        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1, 3, -1, -3, 5, 3, 6, 7));
        int B=3;

        ArrayList<Integer>ret=slidingMaximum(arr,B);
        System.out.println("ret = " + ret);

    }
}
