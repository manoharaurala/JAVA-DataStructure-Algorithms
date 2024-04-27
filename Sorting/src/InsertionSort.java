import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public static void sort(ArrayList<Integer>a){

        int n=a.size();
        for(int i=1;i<n;i++){



            int curpos=i;
            int compare=a.get(i);

            while (curpos>0 && compare<a.get(curpos-1)){

                int temp=a.get(curpos-1);
                a.set(curpos-1,compare);
                a.set(curpos,temp);
                curpos--;
                compare=a.get(curpos);


            }
        }



    }

    public static void main(String[] args) {

        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(3,1,76,23,100,54,58,34,76,45,89,130,110,201,175,350,300));
        sort(arr);

        System.out.println("arr = " + arr);

    }
}
