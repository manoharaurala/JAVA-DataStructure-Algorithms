import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueHeap {

    public static int solve(ArrayList<Integer> A) {



       PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>(new ComparatorMaxHeap());
        for(int num:A){
            priorityQueue.add(num);
        }
       int ans=0;
       while (priorityQueue.size()>0){

           int min1=priorityQueue.peek();
           priorityQueue.remove();

           int min2=priorityQueue.peek();
           priorityQueue.remove();

           int sum=min1+min2;
           ans+=sum;

           priorityQueue.add(sum);

           if(priorityQueue.size()==1) break;


       }

       return ans;


    }

    public static void main(String[] args) {

        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(6,19,9,14,17,16,7,2,14,4,3));
        Collections.sort(arr);
        int ans=solve(arr);
        System.out.println("ans = " + ans);


    }
}
