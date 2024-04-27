import java.util.Arrays;

public class CoinProblem {

    public static int solve(int A) {
        double result = Math.log(A) / Math.log(5);
        int max_coin=(int) Math.floor(result);

        max_coin=(int) Math.pow(5,max_coin);

        int temp=A;
        int count=0;

        while (temp!=0){

            if(temp-max_coin>=0) {

                temp -= max_coin;
                count++;

            }
            else{
                    max_coin = max_coin / 5;
                }


        }

        return count;





    }

    public static void main(String[] args) {
        int A=443;
        int ans=solve(A);
        System.out.println("ans = " + ans);
    }
}
