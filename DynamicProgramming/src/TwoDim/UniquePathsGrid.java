package TwoDim;
import java.lang.reflect.Array;
import java.util.*;

public class UniquePathsGrid {

    public static int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {


        int row=A.size();
        int col=A.get(0).size();

        Integer dp[][]=new Integer[row][col];

        for (int i = 0; i < row; i++) {
            Arrays.fill(dp[i], -1);
        }




        for(int i=0;i<row;i++){



            for(int j=0;j<col;j++){

                if(A.get(i).get(j)==1 ){

                    dp[i][j]=0;

                }

                else if(i==0){
                    dp[i][j]=dp[i][j-1];
                }

                else if(j==0){

                    dp[i][j]=dp[i-1][j];
                }

                else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }


            }
        }

        return dp[row-1][col-1];

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();

       ArrayList<Integer>temp=new ArrayList<>(Arrays.asList(1,0));
        arr.add(temp);

       // temp=new ArrayList<>(Arrays.asList(1,0));
        //arr.add(temp);

       // temp=new ArrayList<>(Arrays.asList(0,0,0));
        //arr.add(temp);

        int ans=uniquePathsWithObstacles(arr);
        System.out.println("ans = " + ans);
    }
}
