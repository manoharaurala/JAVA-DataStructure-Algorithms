import java.util.ArrayList;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int []a={99,12,67,34,56,43,121,9,34,65,32,76,34};
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for (int num : a) {
            arr.add(num);
        }
        quicksort(arr,0,arr.size()-1);

        System.out.println(arr);
    }


    public static void quicksort(ArrayList<Integer> A, int start,int end){


        if(start>=end) return;

        int x=partition(start,end,A);

        quicksort(A,start,x-1);

        quicksort(A,x+1,end);




    }

    private static int partition(int start, int end, ArrayList<Integer> a) {

        Random rand=new Random();

        int randNumber= rand.nextInt(end-start+1)+start;

        int temp=a.get(start);
        a.set(start,a.get(randNumber));
        a.set(randNumber,temp);

        int left=start+1;
        int right=end;

        int pivot=a.get(start);

        while(left<=right){

            if(a.get(left)<=pivot) left++;

            else if (a.get(right)>pivot) { right--;

            }
            else {

                 temp=a.get(left);

                a.set(left,a.get(right));
                a.set(right,temp);
                left++;
                right--;
            }
        }

        temp=a.get(start);
        a.set(start,a.get(right));
        a.set(right,temp);
        return right;


    }



}
