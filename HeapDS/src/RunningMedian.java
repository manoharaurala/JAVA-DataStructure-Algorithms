import java.util.*;
public class RunningMedian implements Comparator<Integer>{

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer>resp=new ArrayList<Integer>();

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(new RunningMedian());

        maxHeap.add(A.get(0));
        resp.add(maxHeap.peek());

        for(int i=1; i<A.size(); i++){

            int temp = A.get(i);

            if(temp<=maxHeap.peek()) {

                maxHeap.add(temp);
                if (maxHeap.size() - minHeap.size() == 2) {
                    minHeap.add(maxHeap.peek());
                    maxHeap.remove();
                }
            }
                else {
                    minHeap.add(temp);
                    if(minHeap.size()> maxHeap.size()){
                        maxHeap.add(minHeap.peek());
                        minHeap.remove();
                }

            }

                    resp.add(maxHeap.peek());


        }


        return resp;




    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2) return -1;
        if(o1 < o2) return 1;
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(5, 17, 100, 11));
        ArrayList<Integer>res=solve(arr);
        System.out.println(res);
    }
}
