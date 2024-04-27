import java.util.*;
public class Productof3 {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>();

        ArrayList<Integer> arr=new ArrayList<Integer>();

        for(int i=0;i<2;i++){
            maxheap.add(A.get(i));
            arr.add(-1);

        }

        maxheap.add(A.get(2));
        int product=1;

        Iterator<Integer> iterator=maxheap.iterator();

        while (iterator.hasNext()){

            product*=iterator.next();

        }

        arr.add(product);


        int n=A.size();
        for(int i=3;i<n;i++){

            int temp=A.get(i);

            if(temp>maxheap.peek()){
                maxheap.remove();
                maxheap.add(temp);
            }

            product=1;
          iterator=maxheap.iterator();
            while (iterator.hasNext()){

                product*=iterator.next();

            }

            arr.add(product);

        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(10, 2, 13, 4));
        ArrayList<Integer> res=solve(arr);
        System.out.println("res = " + res);
    }
}
