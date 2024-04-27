package Knapsack;

import java.util.ArrayList;
import java.util.Arrays;

public class UnboundedKnapsackBottomUp {

    public static int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {

        int x=B.size();
        int y=A;

        int [][]dp=new int[x+1][y+1];

        for(int i=0;i<=x;i++){
            dp[i][0]=0;
        }

        for(int i=0;i<=y;i++){

            dp[0][i]=0;
        }


        for(int i=1;i<=x;i++){

            for(int j=1;j<=y;j++){

                if(j<C.get(i-1)) {
                    dp[i][j]=dp[i-1][j];
                }

                else {

                    dp[i][j] = Math.max(dp[i - 1][j], B.get(i - 1) + dp[i][j - C.get(i - 1)]);
                }
            }
        }



        int ans=dp[x][y];

        return ans;
    }



    public static int knapsackOpt(int A, ArrayList<Integer> B, ArrayList<Integer> C){

        int x=B.size();
        int y=A;

        int prev[]=new int[y+1];
        int cur[]=new int[y+1];

        for(int i=0;i<=x;i++){


            for(int j=0;j<=y;j++){

                if(i==0 || j==0){
                    cur[j]=0;
                }
                else if (j<C.get(i-1)) {

                    cur[j]=prev[j];

                }

                else {

                    cur[j]=Math.max(prev[j],B.get(i-1)+cur[j-C.get(i-1)]);
                }
            }

            prev=cur;

        }
        return cur[y];




    }

    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(6, 7));
        ArrayList<Integer>B=new ArrayList<Integer>(Arrays.asList(5, 5));
        int C=10;

        //int ans=solve(C,A,B);

        int ans=knapsackOpt(C,A,B);

        System.out.println("ans = " + ans);
    }
}
