import java.util.*;
public class MaximumJobs {

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> time_period=new ArrayList<ArrayList<Integer>>();
        int n=A.size();
        for(int i=0;i<n;i++){
            ArrayList<Integer>temp=new ArrayList<Integer>();
            temp.add(A.get(i));
            temp.add(B.get(i));

            time_period.add(temp);
        }

        Collections.sort(time_period,(t1,t2)->{

            if(t1.get(1)> t2.get(1)) return 1;
            else if (t1.get(1)< t2.get(1)) return -1;
            return 0;
        });

        for (int i=0;i<n;i++){

            A.set(i,time_period.get(i).get(0));
        }

        for (int i=0;i<n;i++){

            B.set(i,time_period.get(i).get(1));
        }

        int prev_end=Integer.MIN_VALUE;
        int ans=0;

        for(int i=0;i<n;i++){


            if(A.get(i)>=prev_end){

                ans++;
                prev_end=B.get(i);
            }
        }

        return ans;
    }
}
