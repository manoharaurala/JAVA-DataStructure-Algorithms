import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PerfectNumbers {

    public static String solve(int A) {

        //ArrayList<String> ret=new ArrayList<String>();
        Queue<String> queue=new ArrayDeque<String>();
        queue.add("1");
        queue.add("2");


        String ans="";
        if(A==1) ans+="1";
        if(A==2) ans+="2";

        int count=0;

        while(count<=A){

            String outgoing= queue.remove();
            String incoming=outgoing.concat("1");
            queue.add(incoming);

            count++;
            if(count==A){
                ans=outgoing+strreverse(outgoing);
            }


            incoming=outgoing.concat("2");
            queue.add(incoming);


        }

        return ans;



    }



    public static String strreverse(String A){

        StringBuilder sb=new StringBuilder();
        int n=A.length();

        for(int i=0;i<n;i++){
            sb.append(A.charAt(i));
        }

        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String ans=solve(1000);

        System.out.println(ans);
    }
}
