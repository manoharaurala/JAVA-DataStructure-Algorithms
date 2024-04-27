import java.util.ArrayList;
import java.util.Arrays;

public class Equilibriumarray {
    public static int solve(ArrayList<Integer> A) {
        int n=A.size();

        long pf[]=new long[n];

        pf[0]=(long) A.get(0);

        for(int i=1;i<n;i++){

            pf[i]=pf[i-1]+(long) A.get(i);
        }

        int index=Integer.MAX_VALUE;;

        int ans=0;

        if(pf[n-1]-pf[0]==0) Math.min(0,index);

        if(pf[n-2]==0) Math.min(n-1,index);

        for(int i=1;i<n-1;i++){

            long left_sum=pf[i-1];
            long right_sum=pf[n-1]-pf[i];

            if(left_sum==right_sum) index=Math.min(i,index);


        }
        if(index==Integer.MAX_VALUE) index=-1;
        return index;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
        int ans=solve(arr);
        System.out.println("ans = " +ans);
    }
}
