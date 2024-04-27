import  java.util.*;
public class AllocateBooks {

    public static int books(ArrayList<Integer> A, int B) {

        int n=A.size();

        if(n<B){
            return -1;
        }

        long total_page=A.get(0);
        for(int i=1;i<n;i++){
            total_page+=A.get(i);
        }

        long min_page=A.get(0);

        for(int i=1;i<n;i++){

            min_page=Math.max(min_page,A.get(i));
        }


        long left=min_page;
        long right=total_page;

        long ans=-1;

        while(left<=right){

            long mid=(left+right)/2;

            boolean verdict=f(A,mid,B);

            if(verdict==true){
                right=mid-1;
                ans=mid;
            }

            else{
                left=mid+1;
            }



        }

        return (int) ans;


    }


    public static boolean f(ArrayList<Integer>A,long mid,long B){

        long count=1;
        long cur=0;
        int n=A.size();
        for(int i=0;i<n;i++){

            if(A.get(i)>mid) return false;

            if (cur + A.get(i) <= mid)
                cur += A.get(i);
            else {
                count++;
                cur = A.get(i);
                if (count> B)
                    return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        int []a={12, 34, 67, 90};
        int b=2;
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for(int num:a){
            arr.add(num);
        }


        int ans=books(arr,b);

        System.out.println(ans);
    }
}
