import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
    public static void main(String[] args) {

        SolutionSubArraySum sol=new SolutionSubArraySum();

        Integer[] elements = {-14,-9,12,7,-12,-4,7,25,-5,48,33,-49,36,-31,-48,36,36,17,13,-47,-39,37,-20,35,38,26,-40,-43,36,-48,-33,-30,6,-28,11,27,22,18,-21,-11,-50,34,-21,44,-25,17,34,-12,14,26,30};

        // Create a new ArrayList and add all elements from the array
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, elements);

        int b=16;

        ArrayList<Integer> ans=sol.solve(list,b);

        System.out.println("answer for problem is: "+ans);
    }
}
