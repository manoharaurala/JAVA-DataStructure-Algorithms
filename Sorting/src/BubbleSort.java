import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public static void sort(ArrayList<Integer>a){
        int n=a.size();
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){

                int temp=a.get(j);

                if(temp>a.get(j+1)){

                    a.set(j,a.get(j+1));
                    a.set(j+1,temp);

                }

            }
        }


    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(3,1,76,23,100,54,58,34,76,45,89,130,110,201,175,350,300));
        sort(arr);

        System.out.println("arr = " + arr);

    }
}
