import java.util.*;

public class KthLargestWindow {

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<B;i++){
            pq.add(A.get(i));
        }

        for(int i=B;i<A.size();i++){
            pq.add(A.get(i));
            res.add(pq.remove());
        }

        while (pq.size()>0){
            res.add(pq.remove());
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(100,2, 1, 17, 10, 21, 95));
        int b=3;
        ArrayList<Integer> res = solve(A, b);
        System.out.println("res = " + res);
    }

}
