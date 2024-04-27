package Knapsack;
import java.util.*;
public class FractionalKnapsack {
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {

        int n=A.size();

        ArrayList<ArrayList<Integer>> sortList=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++){

            ArrayList<Integer>temp=new ArrayList<Integer>();
            temp.add(A.get(i));
            temp.add(B.get(i));
            sortList.add(temp);

        }

        Collections.sort(sortList,(x,y)->{

            double ppw1=(double) x.get(0)/x.get(1);
            double ppw2=(double) y.get(0)/y.get(1);

            if(ppw1>ppw2) return -1;
            if(ppw1<ppw2) return 1;

            return 0;
        });


        for(int i=0;i<n;i++){

            A.set(i,sortList.get(i).get(0));
        }

        for(int i=0;i<n;i++){

            B.set(i,sortList.get(i).get(1));
        }

        double ans=0;

        int curr=C;

        for(int i=0;i<n;i++){

            if(curr>=B.get(i)){
                ans+=A.get(i);
                curr-=B.get(i);
            }

            else {

                double fraction=(double) curr/B.get(i);
                ans+=A.get(i)*fraction;
                curr=0;
                break;
            }
        }

        ans=Math.round(ans);

        return (int) (ans*100);
    }

    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<Integer>(Arrays.asList(60, 100, 120));
        ArrayList<Integer>b=new ArrayList<Integer>(Arrays.asList(10, 20, 30));

        int c=50;

        int ans=solve(a,b,c);
        System.out.println("ans = " + ans);
    }


}
