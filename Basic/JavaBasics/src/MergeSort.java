import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int []a={99,12,67,34,56,43,121,9,34,65,32,76,34};
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for (int num : a) {
            arr.add(num);
        }
        mergesort(arr,0,arr.size()-1);

        System.out.println(arr);


    }

    static void mergesort(ArrayList<Integer> arr,int left,int right){

        if(left==right) return;

        int mid=(left+right)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,right);



    }

    static void merge(ArrayList<Integer>arr,int left,int mid, int right){

        int n=right-left+1;

        int left_length=mid-left+1;

        int right_length=right-mid;

        int leftarr []=new int[left_length];

        int rightarr[]=new int[right_length];

        int index=0;

        for(int i=left;i<=mid;i++){

            leftarr[index++]=arr.get(i);
        }

        index=0;

        for(int i=mid+1;i<=right;i++){

            rightarr[index++]=arr.get(i);
        }

        index=left;

        int p1=0;int p2=0;

        while(p1<left_length && p2<right_length){

            if(leftarr[p1]<rightarr[p2]){

                arr.set(index,leftarr[p1]);

                index++;
                p1++;
            }

            else{


                arr.set(index,rightarr[p2]);
                index++;
                p2++;
            }
        }

        while(p1<left_length){

            arr.set(index,leftarr[p1]);
            index++;
            p1++;
        }

        while (p2<right_length){

            arr.set(index,rightarr[p2]);
            index++;
            p2++;
        }




    }
}
