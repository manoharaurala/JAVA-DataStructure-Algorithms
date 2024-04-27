package TwoDim;

import java.util.Arrays;

public class NDigitNumbers {

    final static long mod=1000000007;

    public static int solve(int A, int B) {

        int ans=0;

        long dp[][]=new long[A+1][B+1];

        for(int i=0;i<=A;i++){
            Arrays.fill(dp[i],-1);
        }

        for(int i=1;i<=B;i++){
            int x=A-1;
            int y=B-i;
            ans+=rec(x,y,dp);
        }

        return ans;

    }

    public static int rec(int A,int B,long[][]dp){

        if(A==0 && B==0) return 1;
        if(A==0) return 0;

        long ans=0;

        if(dp[A][B]!=-1) return (int) dp[A][B];

        for(int i=0;i<=B;i++){

            int x=A-1;
            int y=B-i;

            ans+=rec(x,y,dp);
            ans=ans%mod;
        }

        dp[A][B]=ans;

        return (int) ans;

    }

    public static void main(String[] args) {
        int A=2;
        int B=4;

        int ans=solve(2,4);
        System.out.println("ans = " + ans);

    }
}
