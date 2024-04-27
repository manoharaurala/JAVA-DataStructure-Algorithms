import java.util.*;
public class LongestSubarrayZeroSum {

    public static int solve(ArrayList<Integer> A) {

        int ans=0;

        int n=A.size();
        long pfsum[]=new long[n];
        pfsum[0]=A.get(0);

        for(int i=1;i<n;i++){
            pfsum[i]=pfsum[i-1]+(long)A.get(i);
        }

        int start_index=-1;
        int end_index=-1;


        HashMap<Long,Integer> hm =new HashMap<Long,Integer>();




        for(int i=0;i<n;i++){

            start_index=i;

            Long need=pfsum[i];

            if(need==0){

                ans=Math.max(ans,i+1);
            }

            if(hm.containsKey(need)){
                end_index= hm.get(need);
                ans=Math.max(ans,Math.abs(end_index-start_index));
            }
            else {
                hm.put(need,i);
            }


        }




        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(9,-20,-11,-8,-4,2,-12,14,1));

        int ans=solve(arr);
        System.out.println("ans = " + ans);
    }
}
