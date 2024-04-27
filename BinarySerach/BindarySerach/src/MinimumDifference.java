import java.util.*;
public class MinimumDifference {

    public static int solve(int A, int B, ArrayList<ArrayList<Integer>> C) {


        int row=C.size();

        int col=C.get(0).size();

        int min_difference=Integer.MAX_VALUE;

        for(ArrayList<Integer> arr:C){

            Collections.sort(arr);
        }

        for(int i=0;i<row-1;i++){

            for(int j=0;j<col;j++){

                int ele=C.get(i).get(j);

                //System.out.print(ele+" ");

                int ret=binarySearch(C.get(i+1),0,col-1,ele);
                //System.out.print(ele+" "+ret+"   ");

                int difference=Math.abs(ret-ele);

                //System.out.print(difference+" ");
                min_difference=Math.min(difference,min_difference);
                //System.out.println(difference);

            }
        }


        return min_difference;

    }


    public static int binarySearch(ArrayList<Integer>arr,int left,int right,int key){

        while(left<=right){

            int mid=(left+right)/2;

            if(arr.get(mid)==key) return arr.get(mid);

            else if(arr.get(mid)>key) right=mid-1;

            else
                left=mid+1;
        }

        if(right<0) right=0;

        return arr.get(right);


    }

    public static void main(String[] args) {
        int a[][]={{8,4},{6,8}};

        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
        int A=a.length;
        int B=a[0].length;

        for(int i=0;i<A;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<B;j++){
                temp.add(a[i][j]);

            }

            arr.add(temp);
        }

        int ret=solve(A,B,arr);

        System.out.println(ret);


    }
}
