package Knapsack;

import java.util.*;
public class UnboundedKnapsack {
    public static int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {

        int x=B.size();
        int y=A;

        int [][]dp=new int[x+1][y+1];

        for(int i=0;i<=x;i++){
            Arrays.fill(dp[i],-1);
        }

        knapsack(x,y,B,C,dp);

        int ans=dp[x][y];

        return ans;
    }

    public static int knapsack(int x,int y,ArrayList<Integer> A, ArrayList<Integer> B,int[][]dp){

        if(x==0 || y==0) return 0;
        if(dp[x][y]!=-1) return dp[x][y];
        if(y<B.get(x-1)){
            dp[x][y]=knapsack(x-1,y,A,B,dp);
        }

        else {
            dp[x][y] = Math.max(knapsack(x - 1, y, A, B, dp), A.get(x - 1) + knapsack(x , y - B.get(x - 1), A, B, dp));
        }

        return dp[x][y];


    }

    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(6, 7));
        ArrayList<Integer>B=new ArrayList<Integer>(Arrays.asList(5, 5));
        int C=10;

        int ans=solve(C,A,B);

        System.out.println("ans = " + ans);

    }
}
