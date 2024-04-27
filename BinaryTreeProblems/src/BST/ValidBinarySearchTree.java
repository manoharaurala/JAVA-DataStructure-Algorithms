package BST;


import java.util.ArrayList;
import java.util.Arrays;

public class ValidBinarySearchTree {
    public static int isValidBST(Node A) {

        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(0,Integer.MIN_VALUE);
        arr.add(1,1);
       isValidBSTUtil(A,arr);

       if(arr.get(1)==1) return 1;

       return 0;




    }

    public static void isValidBSTUtil(Node root,ArrayList<Integer>A){
        if(A.get(1)==0) return;
        if(root==null) return;


        isValidBSTUtil(root.left,A);

        int prev=A.get(0);
        if(root.data<=prev) A.set(1,0);
        prev=root.data;
        A.set(0,prev);
        isValidBSTUtil(root.right,A);


    }


    public static void main(String[] args) {

        Node root=new Node(3);
        Node left=new Node(2);
        Node right=new Node(4);

        root.left=left;
        root.right=right;

        Node left1=new Node(1);
        Node right1=new Node(3);

        left.left=left1;
        left.right=right1;


        int ans=isValidBST(root);

        System.out.println("ans = " + ans);

    }
}
