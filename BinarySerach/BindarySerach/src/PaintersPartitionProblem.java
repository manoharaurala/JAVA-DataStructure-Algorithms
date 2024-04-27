import  java.util.*;
public class PaintersPartitionProblem {
    final static long mod=10000003;
    public static int paint(int A, int B, ArrayList<Integer> C) {
        int n=C.size();

        ArrayList<Long> arr=new ArrayList<Long>();

        for(int i=0;i<n;i++){

            arr.add((long)C.get(i)*B);
        }


        long max_ele=arr.get(0);

        long ans=-1;

        for(int i=1;i<n;i++){

            max_ele=Math.max(max_ele,arr.get(i));
        }

        long sum=arr.get(0);

        for(int i=1;i<n;i++){

            sum+=arr.get(i);
        }

        long left= max_ele;
        long right=sum;


        long k=(long) A;

        while(left<=right){

            long mid=(left+right)/2;

            boolean verdic=f(arr,mid,k);

            if(verdic==true){
                ans=mid;
                right=mid-1;
            }

            else{

                left=mid+1;
            }
        }

        return (int) (ans%mod);

    }

    public static boolean f(ArrayList<Long> arr,long mid,long k){

        long cur=0;
        int count=1;

        int n=arr.size();
        for(int i=0;i<n;i++){



            if(cur+arr.get(i)<=mid){

                cur= (cur+arr.get(i));
            }

            else{

                count++;
                cur=arr.get(i);
            }
        }

        if(count<=k) return true;

        return false;



    }

    public static void main(String[] args) {
        int []a={884,228,442,889};
        int cow=4;
        int b=10;
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for(int num:a){
            arr.add(num);
        }


        int ans=paint(cow,b,arr);

        System.out.println(ans);
    }
}
