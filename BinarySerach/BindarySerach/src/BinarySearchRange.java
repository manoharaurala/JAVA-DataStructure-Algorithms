import java.util.*;
public class BinarySearchRange {

    public static ArrayList<Integer> searchRange(final List<Integer> A, int B) {

        int n=A.size();
        int left=0;
        int right=n-1;

        int lindex=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(A.get(mid)==B){

                lindex=mid;
                right=mid-1;
            }

            else if(A.get(mid)>B) right=mid-1;

            else left=mid+1;

        }

        int rindex=-1;

        left=0;
        right=n-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(A.get(mid)==B){

                rindex=mid;
                left=mid+1;
            }

            else if(A.get(mid)>B) right=mid-1;

            else left=mid+1;

        }
        ArrayList<Integer> ret=new ArrayList<Integer>();
        if(rindex!=-1 && lindex==-1){
            ret.add(-1);
            ret.add(-1);

        }

        else{

            ret.add(lindex);
            ret.add(rindex);
        }

        return ret;

    }

    public static void main(String[] args) {

        Integer A[]={5, 7, 7, 8, 8, 10};
        int B=8;

        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(A));

        ArrayList<Integer> ret=searchRange(arr,B);

        System.out.println(ret);



    }
}
