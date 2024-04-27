package ViewsandTypes;

public class BalancedBinaryTree {
    static int isBBL;

    static {
        isBBL=1;
    }
    public static int isBalanced(Node A) {
        int ans=height(A);
        if(isBBL==1) return 1;

        return 0;


    }


    public static int height(Node A) {
        if(A==null) return -1;
        int hl=height(A.left);
        int hr=height(A.right);
        if(Math.abs(hl-hr)>1) isBBL=0;
        return 1+Math.max(hl,hr);

    }



    public static void main(String[] args) {
       Node root=new Node(1);
        Node left=new Node(2);
        Node right=new Node(3);
        root.left=left;
        root.right=right;

        Node left1=new Node(4);
        Node right1=new Node(5);
        left.left=left1;
        left.right=right1;

        Node right3=new Node(6);
        right.right=right3;

        Node left2=new Node(7);
        Node right2=new Node(8);
        left1.left=left2;
        left1.right=right2;

        /*Node root=new Node(2);
        Node right=new Node(1);
        root.right=right;*/


        int ans=isBalanced(root);


        if(ans==1){
            System.out.println("Balanced Binary Tree");
        }
        else {
            System.out.println("It is not Balanced Binary Tree");
        }

    }
}
