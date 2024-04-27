package Knapsack;

import java.util.*;
public class Knapsack0_1 {

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {

        int x=A.size();
        int y=C;

        int [][]dp=new int[x+1][y+1];

        for(int i=0;i<=x;i++){
            Arrays.fill(dp[i],-1);
        }

        knapsack(x,y,A,B,dp);

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
            dp[x][y] = Math.max(knapsack(x - 1, y, A, B, dp), A.get(x - 1) + knapsack(x - 1, y - B.get(x - 1), A, B, dp));
        }

        return dp[x][y];


    }

    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(60, 100, 120));
        ArrayList<Integer>B=new ArrayList<Integer>(Arrays.asList(10, 20, 30));
        int C=50;

        int ans=solve(A,B,C);

        System.out.println("ans = " + ans);



    }
}
