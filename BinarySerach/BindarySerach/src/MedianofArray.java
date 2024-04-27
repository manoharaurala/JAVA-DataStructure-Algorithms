import java.util.*;
public class MedianofArray {

    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        int n1=a.size();
        int n2=b.size();

        if(n1>n2) return findMedianSortedArrays(b,a);
        int n=n1+n2;

        int firsthalfcount=(n+1)/2;

        int left=0;
        int right=Math.min(firsthalfcount,n1);

        while(left<=right){

            int mid1=left+(right-left)/2;
            int mid2=firsthalfcount-mid1;

            int l1=mid1>0?a.get(mid1-1):Integer.MIN_VALUE;
            int r1=mid1<n1?a.get(mid1):Integer.MAX_VALUE;

            int l2=mid2>0?b.get(mid2-1):Integer.MIN_VALUE;
            int r2=mid2<n2?b.get(mid2):Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1){

                if(n%2==1) return Math.max(l1,l2);

                else{

                    return (double) (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }

            else if(l1>r2){
                right=mid1-1;
            }

            else {
                left=mid1+1;
            }

        }

        return -1;




        }





    public static void main(String[] args) {

        int []A={-50, -41, -40, -19, 5, 21, 28};
                //{-43, -25, -18, -15, -10, 9, 39, 40};
        int []B={-50, -21, -10 };
                //{ -2,33 };

        ArrayList<Integer> a=new ArrayList<Integer>();

        for(int num:A){
            a.add(num);
        }
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int num:B){
            b.add(num);
        }
        double ans=findMedianSortedArrays(a,b);
        System.out.println(ans);
    }
}
