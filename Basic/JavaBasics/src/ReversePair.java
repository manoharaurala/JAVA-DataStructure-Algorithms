import  java.util.*;
public class ReversePair {
    static int mergesort(ArrayList<Integer> arr,int left,int right){

        int count=0;

        if(left<right){



            int mid=(left+right)/2;
            count+=mergesort(arr,left,mid);
            count+=mergesort(arr,mid+1,right);
            count+=merge(arr,left,mid,right);

        }

        return count;



    }


    static int merge(ArrayList<Integer>arr,int left,int mid, int right){

        int n=right-left+1;

        int swaps=0;

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

            if(leftarr[p1]<=rightarr[p2]){

                arr.set(index,leftarr[p1]);

                index++;
                p1++;
            }

            else{


                arr.set(index,rightarr[p2]);

                long temp1=(long)leftarr[p1];
                long temp2=(long)rightarr[p2];
                temp2*=2;


                if(temp1>temp2){
                    swaps += left_length-p1;
                }


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

        return swaps;


    }

    public static void main(String[] args) {
        int []a={1, 3, 2, 3, 1};

        ArrayList<Integer> arr=new ArrayList<>();

        for(int i:a){
            arr.add(i);
        }

        int count=mergesort(arr,0,arr.size()-1);

        System.out.println(count);
    }


}


