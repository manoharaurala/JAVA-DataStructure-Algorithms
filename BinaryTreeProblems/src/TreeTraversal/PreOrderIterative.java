package TreeTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PreOrderIterative {

    public static void preorder_travel_iterative(Node root, ArrayList<Integer>arr){

        Stack<Node>stack=new Stack<Node>();

        Node cur=root;
        stack.push(cur);

        while (!stack.isEmpty()){
           cur=stack.pop();

           arr.add(cur.data);

           if(cur.right!=null){
               stack.push(cur.right);
           }

           if(cur.left!=null){
               stack.push(cur.left);
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

        ArrayList<Integer> ret=new ArrayList<Integer>();
        preorder_travel_iterative(root,ret);
        System.out.println("ret = " + ret);



    }
}
