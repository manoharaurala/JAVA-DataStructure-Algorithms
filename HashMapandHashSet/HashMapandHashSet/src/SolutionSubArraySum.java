import java.util.*;
public class SolutionSubArraySum {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {


        HashMap <Long,Integer>hm=new HashMap<Long,Integer>();

        int n=A.size();
        long []pfsum=new long[n];

        pfsum[0]=A.get(0);
        for(int i=1;i<n;i++){

            pfsum[i]=pfsum[i-1]+(long)A.get(i);
        }

        int end=-1;
        int start=-1;

        for(int i=0;i<n;i++){

            if(pfsum[i]==B){
                start=0;
                end=i;
                break;
            }

            long need=pfsum[i]-B;
            long key=pfsum[i];

            if(hm.containsKey(need)){
                start=hm.get(need)+1;
                end=i;
                break;
            }
            else if(hm.containsKey(key)){

                continue;
            }
            else{

                hm.put(key,i);

            }



        }

        ArrayList<Integer> ret = new ArrayList<>();

        if (end == -1) {
            ret.add(-1);
        } else {
            for (int i = start; i <= end; i++) {
                ret.add(A.get(i));
            }
        }

        return ret;











    }
}
