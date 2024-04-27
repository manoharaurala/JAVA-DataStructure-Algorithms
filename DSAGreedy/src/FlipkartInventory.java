import java.util.*;
public class FlipkartInventory{

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> exp_profit=new ArrayList<ArrayList<Integer>>();

        int n=A.size();
        for(int i=0;i<n;i++){
            ArrayList<Integer>temp=new ArrayList<Integer>();
            temp.add(A.get(i));
            temp.add(B.get(i));

            exp_profit.add(temp);
        }

        Collections.sort(exp_profit,(t1,t2)->{
            if(t1.get(0)> t2.get(0)) return 1;
            else if (t1.get(0)< t2.get(0)) return -1;
            return 0;
        } );

        for (int i=0;i<n;i++){

            A.set(i,exp_profit.get(i).get(0));
        }

        for (int i=0;i<n;i++){

            B.set(i,exp_profit.get(i).get(1));
        }

        int t=1;

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();

        for(int i=0;i<n;i++){
            if(t<=A.get(i)){
                priorityQueue.add(B.get(i));
                t++;
            }
            else {

                if(B.get(i)>priorityQueue.peek()){
                    priorityQueue.add(B.get(i));
                    priorityQueue.remove();
                }
            }

        }

        int total_sum=0;
        while (priorityQueue.size()>0){
            total_sum+= priorityQueue.peek();;
            priorityQueue.remove();
        }

        return total_sum;

    }

    public static void main(String[] args) {
        ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList(1, 3, 2, 3, 3));
        ArrayList<Integer>B=new ArrayList<Integer>(Arrays.asList(5, 6, 1, 3, 9));
        int sum=solve(A,B);
        System.out.println("sum = " + sum);

    }


}
