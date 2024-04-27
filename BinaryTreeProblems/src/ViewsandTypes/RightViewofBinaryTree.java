package ViewsandTypes;

import java.util.*;


public class RightViewofBinaryTree {

    static Queue<Node> q;
    static{
        q=new ArrayDeque<Node>();
    }
    public static ArrayList<Integer> solve(Node A) {
        ArrayList<Integer> ret=new ArrayList<Integer>();
        rightView(A,ret);

        return ret;
    }

    public static void rightView(Node root,ArrayList<Integer>arr){

        q.add(root);

        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.peek();
                q.remove();

                if(i==size-1){
                    arr.add(curr.data);
                }

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }

            }

        }

    }

    public static void main(String[] args) {
        Node root=new Node(10);
        Node left=new Node(5);
        Node right=new Node(15);
        root.left=left;root.right=right;

        Node left1=new Node(3);
        Node right1=new Node(4);
        left.left=left1;
        left.right=right1;

        Node left3=new Node(12);
        right.left=left3;

        Node right3=new Node(16);
        left3.right=right3;

        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr=solve(root);
        System.out.println(arr);
    }
}
