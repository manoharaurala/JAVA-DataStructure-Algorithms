package src;
import java.util.*;

public class PairswithGivenDifference {

    public static int solve(ArrayList<Integer> A, int B) {

        Collections.sort(A);
        int n = A.size();
        int i = 0;
        int j = 1;
        int count = 0;

        while (j < n) {
            if (A.get(j) - A.get(i) == B) {
                count++;
                i++;

                int cur=A.get(j);
                while(j<n && A.get(j)==cur){
                    j++;
                }
            }
            else if (A.get(j) - A.get(i) > B) {
                i++;

            }
            else {
                j++;
            }

            if (i == j) {
                j++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int []a={1,1,1,2,2};
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int num:a){
            arr.add(num);
        }
        int b=0;
        int ans=solve(arr,b);
        System.out.println(ans);

    }
}
