package OneDim;

import java.util.Arrays;

public class Stairs {

    final static long mod=1000000007;
    public static int climbStairs(int A) {

        long dp[]=new long[A+1];

        dp[0]=1;
        dp[1]=2;

        for(int i=2;i<A;i++){

            long temp=dp[i-1]+dp[i-2];
            temp=temp%mod;
            dp[i]=temp;

        }

        int ans=(int) (dp[A-1]%mod);

        return ans;
    }

    public static void main(String[] args) {

        int ans=climbStairs(55007);
        System.out.println("ans = " + ans);

    }


}
