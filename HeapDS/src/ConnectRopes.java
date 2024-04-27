import java.util.*;
public class ConnectRopes {
    public static int solve(ArrayList<Integer> A) {
        int n=A.size();
        int ans=0;

        while(A.size()>0){

            int min1=A.get(0);
            deletemin(A,min1);

            int min2=A.get(0);
            deletemin(A,min2);

            int sum=min1+min2;
            ans+=sum;
            if (A.size()>0){
                insertele(A, sum);
            }
            else {
                break;
            }

        }

        return ans;

    }

    private static void insertele(ArrayList<Integer> a, int sum) {
        a.add(sum);

        int x=a.size()-1;
        int p=(x-1)/2;

        while (x>0){
            p=(x-1)/2;
            int temp1=a.get(x);
            int temp2=a.get(p);

            if(temp2>temp1){
                a.set(x,temp2);
                a.set(p,temp1);
                x=p;
            }
            else {
                break;
            }
        }
    }

    private static void deletemin(ArrayList<Integer> a, int min1) {
        int temp1=a.get(0);
        int temp2=a.get(a.size()-1);
        a.set(0,temp2);
        a.set(a.size()-1,temp1);

        a.remove(a.size()-1);

        heapify(a,0);


    }

    private static void heapify(ArrayList<Integer> a, int x) {
        int n = a.size();

        while (x < n) {
            int leftChild = 2 * x + 1;
            int rightChild = 2 * x + 2;
            int minIndex = x;

            if (leftChild < n && a.get(leftChild) < a.get(minIndex)) {
                minIndex = leftChild;
            }

            if (rightChild < n && a.get(rightChild) < a.get(minIndex)) {
                minIndex = rightChild;
            }

            if (minIndex != x) {
                int temp = a.get(x);
                a.set(x, a.get(minIndex));
                a.set(minIndex, temp);
                x = minIndex;
            } else {
                break;
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(6,19,9,14,17,16,7,2,14,4,3));
        Collections.sort(arr);
        int ans=solve(arr);
        System.out.println("ans = " + ans);
    }



}
