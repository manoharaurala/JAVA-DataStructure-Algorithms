package TreeTraversal;

import java.util.ArrayList;
import java.util.Stack;

public class InOrder {


    static Stack<Node> stack;
    static {
        stack=new Stack<Node>();
    }

    public static void inorder_travel(Node root){
        if(root==null) return;
        inorder_travel(root.left);

        System.out.print(" "+root.data);

        inorder_travel(root.right);
    }

    public static void iterative_inorder_travel(Node root, ArrayList<Integer> arr){
        Node curr=root;

        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            else {
                curr = stack.peek();
                stack.pop();
                //System.out.println(curr.data);
                arr.add(curr.data);
                curr = curr.right;
            }

        }

        stack.clear();



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

        //Inorder recursion call
        InOrder.inorder_travel(root);

        //Inorder iterative call
        ArrayList<Integer> ret=new ArrayList<Integer>();
        InOrder.iterative_inorder_travel(root,ret);
        System.out.println("\n"+ret);
    }


}
