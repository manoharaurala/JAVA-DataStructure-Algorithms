package TreeTraversal;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrder {

    static Stack<Node> stack;
    static Stack<Node> visitNode;
    static {
        stack=new Stack<Node>();
        visitNode=new Stack<Node>();
    }

    public static void postorder_travel(Node root){

        if (root==null) return;
        postorder_travel(root.left);
        postorder_travel(root.right);
        System.out.print(root.data+" ");


    }

    public static void postorder_travel_iterative(Node root, ArrayList<Integer>arr){

        Stack<Node>stack=new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node cur=stack.pop();
            arr.add(0, cur.data);

            if(cur.left!=null){
               stack.push(cur.left);
            }

            if(cur.right!=null){
              stack.push(cur.right);
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

        postorder_travel(root);
        ArrayList<Integer> ret=new ArrayList<Integer>();

       postorder_travel_iterative(root,ret);
        System.out.println("\n"+ret);
    }

}
