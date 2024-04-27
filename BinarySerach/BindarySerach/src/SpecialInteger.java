import java.util.*;
public class SpecialInteger {

    public static int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        int left=0;
        int right=n;
        long sum=B;
        int ans=1;


        while(left<=right){

            int mid=(left+right)/2;

            boolean verdict=f(A,mid,sum);

            if(verdict==true){
                ans=mid;
                left=mid+1;
            }

            else{

                right=mid-1;
            }
        }

        return ans;
    }

    public static boolean f(ArrayList<Integer>A,int mid,long sum){

        int n=A.size();

        boolean flag=true;
        long arrsum=A.get(0);
        for(int i=1;i<mid;i++){
            arrsum+=A.get(i);

        }

        if(arrsum>sum) {
            return false;
        }

        for(int i=1;i<=n-mid;i++){
            arrsum=arrsum-A.get(i-1)+A.get(i+mid-1);

                if(arrsum>sum) {
                    return false;
                }

        }

        return true;


    }

    public static void main(String[] args) {
        int []a={1,1000000000};
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for(int num:a){
            arr.add(num);
        }

        int b=1000000000;


        int ans=solve(arr,b);

        System.out.println(ans);
    }
}
