import java.util.*;
public class PickfrombothSides {
    public static int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        int lsum=0;
        int rsum=0;

        for(int i=n-1;i>(n-B);i--){
            rsum+=A.get(i);
        }


        int ans=Math.max(lsum,rsum);



        for(int i=0;i<B;i++){

            lsum+=A.get(i);
            int j=n-B+i;

            rsum=A.get(j);

            ans=Math.max(ans,lsum);
            ans=Math.max(ans,rsum);

        }

        return ans;


    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(2, 3, -1, 4, 2, 1));
        int B=4;

        int ans=solve(arr,B);

        System.out.println("ans = " + ans);
    }
}
