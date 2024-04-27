package OneDim;
import java.util.*;


public class MaxSumWithoutAdjacentElements {
    public static int adjacent(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> temp=new ArrayList<Integer>();

        int n=A.get(0).size();

        for(int i=0;i<n;i++){

            int num=Math.max(A.get(0).get(i),A.get(1).get(i));

            temp.add(num);
        }


        int dp[]=new int[n];
        dp[0]=temp.get(0);
        dp[1]=Math.max(dp[0],temp.get(1));


        int ans=Math.max(dp[0],dp[1]);
        for(int i=2;i<n;i++){

            dp[i]=Math.max(dp[i-1],temp.get(i)+dp[i-2]);
            ans=Math.max(dp[i],ans);

        }

        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> temp1=new ArrayList<Integer>(Arrays.asList(16,5,54,55,36,82,61,77,66,61));
        ArrayList<Integer> temp2=new ArrayList<Integer>(Arrays.asList(31,30,36,70,9,37,1,11,68,14));

        ArrayList<ArrayList<Integer>>A=new ArrayList<ArrayList<Integer>>();
        A.add(temp1);
        A.add(temp2);

        int ans=adjacent(A);
        System.out.println("ans = " + ans);
    }
}
