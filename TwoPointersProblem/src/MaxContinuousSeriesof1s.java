package src;

import java.util.*;
public class MaxContinuousSeriesof1s {
    public static ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {

        int final_p1=0;
        int final_p2=0;
        int ans=Integer.MIN_VALUE;
        int n=A.size();
        int p1=0;
        int countzero=0;


        for(int p2=0;p2<n;p2++){

            if(A.get(p2)==0){
                countzero++;
            }

            while (countzero>B){

                if(A.get(p1)==0){
                    countzero--;
                }

                p1++;

            }

            int temp=(p2-p1+1);

            if(temp>ans){
                ans=temp;
                final_p1=p1;
                final_p2=p2;
            }


        }


        ArrayList<Integer>ret=new ArrayList<Integer>();

        for(int i=final_p1;i<=final_p2;i++){
            ret.add(A.get(i));
        }

        return ret;


    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 1, 0, 0, 1, 1, 1));
        int B=2;

        ArrayList<Integer>ret=maxone(arr,B);
        System.out.println("ret = " + ret);
    }
}
