package TreeTraversal;

import java.util.*;
public class ZigZagLevelOrder {

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(Node A) {

        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        arr=levelorder_traversal(A,arr);
        return arr;

    }


    public static ArrayList<ArrayList<Integer>> levelorder_traversal(Node root,ArrayList<ArrayList<Integer>> arr){

        ArrayDeque<Node>q=new ArrayDeque<Node>();

        q.add(root);
        boolean flag=true;

        while(q.size()>0){
            int size=q.size();
            ArrayList<Integer>temp=new ArrayList<Integer>();

            for(int i=0;i<size;i++){
                Node cur=q.peek();
                q.remove();

                if(flag){
                    temp.add(0, cur.data);
                }
                else {
                    temp.add(cur.data);
                }

                if(cur.right!=null){
                    q.add(cur.right);
                }
                if(cur.left!=null){
                    q.add(cur.left);
                }

            }
            flag=!flag;
            arr.add(temp);


        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList());
    }
}
