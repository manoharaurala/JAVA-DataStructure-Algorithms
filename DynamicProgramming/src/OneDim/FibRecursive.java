package OneDim;

import java.util.Arrays;

public class FibRecursive {

    public static int fib(int n,int dp[]){

        if(dp[n]!=-1) return dp[n];

        dp[n]=fib(n-1,dp)+fib(n-2,dp);

        return dp[n];

    }

    public static void main(String[] args) {

        int dp[]=new int[45];

        for(int i=0;i<45;i++){
            dp[i]=-1;
        }

        dp[0]=0;
        dp[1]=1;

        int ans=fib(6,dp);

        System.out.println("ans = " + ans);

    }
}
