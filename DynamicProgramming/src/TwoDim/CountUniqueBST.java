package TwoDim;

import java.lang.reflect.Array;
import java.util.*;
public class CountUniqueBST {

    public static int numTrees(int A) {

        int dp[]=new int[A+1];

        Arrays.fill(dp,-1);

        generateCatalan(A,dp);

        return dp[A];





    }

    public static int generateCatalan(int x,int[] dp){

        if(x==0 || x==1)  {
            dp[x]=1;
            return 1;
        }

        if(dp[x]!=-1) return dp[x];

        int ans=0;

        int i=x-1;
        int j=0;

        while (j<x){

            ans+=generateCatalan(i,dp)*generateCatalan(j,dp);
            i--;
            j++;
        }

        dp[x]=ans;

        return ans;

    }

    public static void main(String[] args) {
        int ans=numTrees(4);

        System.out.println("ans = " + ans);
    }





}
