import java.util.*;

public class AssignMiceHoles {
    public static int mice(ArrayList<Integer> A, ArrayList<Integer> B) {

        Collections.sort(A);
        Collections.sort(B);
        int n=A.size();

        int max_time=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            max_time=Math.max(max_time,Math.abs(A.get(i)-B.get(i)));
        }

        return max_time;

    }

    public static void main(String[] args) {
        ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList(-49,58,72,-78,9,65,-42,-3));
        ArrayList<Integer>B=new ArrayList<Integer>(Arrays.asList(30,-13,-70,58,-34,79,-36,27));
        int ans=mice(A,B);
        System.out.println("ans = " + ans);
    }
}
