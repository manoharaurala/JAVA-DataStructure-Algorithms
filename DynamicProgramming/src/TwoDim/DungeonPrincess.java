package TwoDim;

import java.util.*;

public class DungeonPrincess {
    public static int calculateMinimumHP(ArrayList<ArrayList<Integer>> A) {

        int n=A.size();
        int m=A.get(0).size();

        Integer [][]dp=new Integer[n+1][m+1];

        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans=f(0,0,A,dp);

        return ans;



    }

    public static int f(int x,int y,ArrayList<ArrayList<Integer>> A,Integer [][]dp){

        if(x==A.size()-1 && y==A.get(0).size()-1){


            dp[x][y]= Math.max(1,1-A.get(x).get(y));

            return dp[x][y];
        }

        else if(x==A.size()-1){

            if(dp[x][y]!=-1){
                return dp[x][y];
            }


            dp[x][y]=Math.max(1,f(x,y+1,A,dp)-A.get(x).get(y));
            return dp[x][y];
        }

        else if(y==A.get(0).size()-1){

            if(dp[x][y]!=-1){
                return dp[x][y];
            }
            dp[x][y]=Math.max(1,f(x+1,y,A,dp)-A.get(x).get(y));
            return dp[x][y];
        }

        else{
            if(dp[x][y]!=-1){
                return dp[x][y];
            }
            dp[x][y]= Math.max(1,Math.min(f(x+1,y,A,dp),f(x,y+1,A,dp))-A.get(x).get(y));

        }

        return dp[x][y];



    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer>temp=new ArrayList<>(Arrays.asList(-2, -3, 3));
        arr.add(temp);

        temp=new ArrayList<>(Arrays.asList(-5, -10, 1));
        arr.add(temp);

        temp=new ArrayList<>(Arrays.asList(10, 30, -5));
        arr.add(temp);


        int ans=calculateMinimumHP(arr);
        System.out.println("ans = " + ans);
    }
}
