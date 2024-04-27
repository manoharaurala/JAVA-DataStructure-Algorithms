import java.util.*;
public class ADDORNOT {

    public void solve(ArrayList<Integer> A, int B) {

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int n=A.size();
        for(int i=0;i<n;i++){

            int key=A.get(i);
            hm.put(key,hm.getOrDefault(1,0));
        }

    }

    public static void main(String[] args) {

    }
}
