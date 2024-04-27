import java.util.*;
public class DistributeCandy {

    public static int candy(ArrayList<Integer> A) {

        int n=A.size();
        int left[]=new int[n];
        int right[]=new int[n];

        left[0]=1;
        for(int i=1;i<n;i++){

            if(A.get(i)>(int)A.get(i-1)){
                left[i]=1+left[i-1];
            }
            else left[i]=1;
        }
        right[n-1]=1;

        for(int i=n-2;i>=0;i--){

            if(A.get(i)>(int)A.get(i+1)){
                right[i]=1+right[i+1];
            }

            else right[i]=1;
        }

        int ans=0;

        for(int i=0;i<n;i++){

            ans+=Math.max(left[i],right[i]);
        }

        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList(1, 5, 2, 1));
        int ans=candy(A);
        System.out.println("ans = " + ans);
    }
}
