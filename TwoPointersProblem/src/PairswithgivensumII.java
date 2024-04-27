package src;
import  java.util.*;
public class PairswithgivensumII {
    public static int solve(ArrayList<Integer> A, int B) {

        int n = A.size();
        int i = 0;
        int j = n - 1;
        long count = 0;

        while (i < j) {
            long sum = (long) A.get(i) + A.get(j);
            if (sum == B) {
                int cur = A.get(i);
                long count1 = 0;
                while (i < n && A.get(i) == cur) {
                    count1++;
                    i++;
                }

                cur = A.get(j);
                long count2 = 0;
                while (j >= 0 && A.get(j) == cur) {
                    count2++;
                    j--;
                }

                // If both pointers are pointing to the same element, use combination formula to count pairs
                if (A.get(i - 1) .equals(A.get(j + 1))) {
                    count += (count1 * (count1 - 1)) / 2;
                } else {
                    count += count1 * count2;
                }
            } else if (sum > B) {
                j--;
            } else {
                i++;
            }
        }

        long mod = 1000000007;
        count = count % mod;

        return (int) count;

    }

    public static void main(String[] args) {
        int []a={4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666,4629666};
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int num:a){
            arr.add(num);
        }
        int b=9259332;
        int ans=solve(arr,b);
        System.out.println(ans);
    }
}
