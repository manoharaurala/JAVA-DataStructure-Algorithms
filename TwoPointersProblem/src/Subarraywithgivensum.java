package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Subarraywithgivensum {

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B){
        ArrayList<Integer> ret=new ArrayList<Integer>();

        int n=A.size();

        int pf[]=new int[n];

        pf[0]=A.get(0);
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+A.get(i);
        }

        int i=0;
        int j=1;

        if(pf[0]==B){
            ret.add(pf[0]);
            return ret;
        }
        int index=-1;

        while(i<j && j<n){


            if(pf[j]==B){
                index=0;
                break;

            }
            int diff=pf[j]-pf[i];

            if(diff==B){
                index=i;
                break;
            }
            else if (diff<B) {
                j++;

            }

            else i++;



        }

        if(index==-1){
            ret.add(-1);
        }
        else {

            for (int start = index+1; start <= j; start++) {
                ret.add(A.get(start));
            }
        }

        return ret;

    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(5, 10, 20, 100, 105));
        int B=105;

        ArrayList<Integer>ret=solve(arr,B);
        System.out.println("ret = " + ret);

    }
}
