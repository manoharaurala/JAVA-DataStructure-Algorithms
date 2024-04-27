package ApplicationOfKnapsack;

import java.util.ArrayList;
import java.util.Arrays;

public class CuttingRod {

    public static int solve(ArrayList<Integer> A) {

        int n=A.size();

        int dp[]=new int[n+1];

        for(int i=1;i<=n;i++){


            for(int j=i;j<=n;j++){

                dp[j]=Math.max(dp[j],A.get(i-1)+dp[j-i]);

            }


        }

        return dp[n];

    }

    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(3, 4, 1, 6, 2));
        int ans=solve(arr);
        System.out.println("ans = " + ans);

    }
}
