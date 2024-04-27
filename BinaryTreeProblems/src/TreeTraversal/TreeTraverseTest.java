package TreeTraversal;

import java.util.ArrayList;

public class TreeTraverseTest {
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

        //Preorder recursion call

        ret.clear();
        //Preorder iterative call

        System.out.println("\n"+ret);

        //PostOrder iterative ca;;
        PostOrder.postorder_travel(root);


    }
}
