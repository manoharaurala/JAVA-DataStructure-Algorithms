import java.util.*;
public class CountSubarrayZeroSum {

    final static long mod=1000000007;
    public static int solve(ArrayList<Integer> A) {

        HashMap<Long,Long> pfhm=new HashMap<Long,Long>();

        int n=A.size();
        long count=0;
        long sum=0;

        for(int i=0;i<n;i++){
            sum+=A.get(i);
            if(sum==0){

                count++;
                continue;
            }

            if(pfhm.containsKey(sum)){

                count=count+pfhm.get(sum);
                pfhm.put(sum,pfhm.get(sum)+1);
            }

            else{

                pfhm.put(sum,(long)1);
            }

        }

        return (int)(count%mod);
    }

    public static void main(String[] args) {
        int []arr={30,-30,30,-30};
        ArrayList<Integer>A=new ArrayList<Integer>();

        for(int num:arr){
            A.add(num);
        }

        int ans=solve(A);
        System.out.println(ans);
    }
}
