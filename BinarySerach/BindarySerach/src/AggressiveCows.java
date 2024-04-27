import java.util.*;
public class AggressiveCows {

    public static int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n=A.size();
        int m=B;
        int ans=-1;
        int min_diff=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            min_diff=Math.min(min_diff,A.get(i)-A.get(i-1));

        }
        int max_diff=A.get(n-1)-A.get(0);

        int left=min_diff;
        int right=max_diff;

        while(left<=right){

            int mid=(left+right)/2;
            boolean verdic=f(A,mid,m);

            if(verdic==true){

                ans=mid;
                left=mid+1;
            }

            else{
                right=mid-1;
            }
        }

        return ans;
    }


    public static boolean f(ArrayList<Integer>A,int mid,int k){

        int count=1;

        int last=A.get(0);
        int n=A.size();

        for(int i=1;i<n;i++){

            if(A.get(i)-last>=mid){
                count++;
                last=A.get(i);
            }
        }

        if(count>=k) return true;

        return false;
    }

    public static void main(String[] args) {
        int []a={5,17,100,11};
        int m=2;
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for(int num:a){
            arr.add(num);
        }


        int ans=solve(arr,m);

        System.out.println(ans);
    }
}
