package OneDim;

import java.util.Arrays;

public class MinSquare {

    public static int countMinSquares(int A) {
        int dp[]=new int[A+1];

        for(int i=0;i<=A;i++){
            dp[i]=-1;
        }
        int ans=calcMinSquares(A,dp);

        return ans;
    }

    public static int calcMinSquares(int A,int dp[]){

        if(A<=2) return A;

        if(dp[A]!=-1) return dp[A];

        int ans=Integer.MAX_VALUE;

        for(int i=1;i*i<=A;i++){

            ans=Math.min(ans,calcMinSquares((A-(i*i)),dp));
        }

        dp[A]=1+ans;

        return dp[A];

    }

    public static void main(String[] args) {
        int ans = countMinSquares(6);
        System.out.println("ans = " + ans);
    }

}
