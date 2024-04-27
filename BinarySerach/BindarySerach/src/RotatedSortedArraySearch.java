import  java.util.*;
public class RotatedSortedArraySearch {
    public  static int search(final List<Integer> A, int B) {

        int left=0;
        int right=A.size()-1;
        int first=A.get(0);
        int target=B;

        while(left<=right){

            int mid=(left+right)/2;
            int mid_ele=A.get(mid);

            if(mid_ele==target) return mid;

            if(mid_ele>=first && target>=first){

                if(mid_ele>target){

                    right=mid-1;
                }

                else{

                    left=mid+1;
                }
            }

            else if(mid_ele<first && target<first){

                if(mid_ele>target){

                    right=mid-1;
                }

                else{

                    left=mid+1;
                }
            }

            else if(mid_ele<first && target>=first){
                right=mid-1;
            }

            else if(mid_ele>first && target<first){
                left=mid+ 1;
            }


        }

        return -1;
    }

    public static void main(String[] args) {
        Integer A[]={5, 1,3};
        int B=5;

        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(A));

        int ret=search(arr,B);

        System.out.println(ret);
    }
}
