import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SelctionSort {

    public static void sort(ArrayList<Integer>a){


        int n=a.size();

        for(int i=0;i<n;i++){

            int min_index=i;


            for(int j=i+1;j<n;j++){
                int min=a.get(min_index);

                if(a.get(j)<min){

                    min_index=j;
                }
            }
            int temp=a.get(i);
            a.set(i,a.get(min_index));
            a.set(min_index,temp);
        }

    }

    public static void main(String[] args) {


        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(3,1,76,23,100,54,58,34,76,45,89,130,110,201,175,350,300));
        sort(arr);

        System.out.println("arr = " + arr);
    }
}
