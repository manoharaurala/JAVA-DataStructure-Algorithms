package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {
    public static int threeSumClosest(ArrayList<Integer> A, int B) {

        Collections.sort(A);
        int n=A.size();
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            int num=A.get(i);
            int need=B-num;
            int left=i+1;
            int right=n-1;


            while (left<right){
                int sum=A.get(left)+A.get(right);
                if(sum==need){
                    return sum+num;
                }
                else if (sum<need) {
                    ans=Math.abs(B-ans)>Math.abs(B-sum-A.get(i))?sum+A.get(i):ans;
                    left++;

                }

                else {
                    ans=Math.abs(B-ans)>Math.abs(B-sum-A.get(i))?sum+num:ans;
                    right--;

                }


            }
        }

        return ans;


    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(101,12,34,56,78,12,34,56,78,12,100,28,32));
        int B=45;
        int ans=threeSumClosest(arr,B);
        System.out.println("ans = " + ans);
    }
}
