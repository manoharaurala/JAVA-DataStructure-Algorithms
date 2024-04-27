package BTProblems;

import java.util.Arrays;

public class SumbinaryTree {

    public static int solve(Node A) {
        Boolean[]ans=new Boolean[1];
        if(A.left==null && A.right==null) return 0;
        ans[0]=true;
        sum(A,ans);

        if(ans[0]==true) return 1;

        return 0;

    }

    public static int sum(Node root,Boolean[]ans){

        if(root==null) return 0;

        int leftsum=sum(root.left,ans);
        int rightsum=sum(root.right,ans);

        int lrsum=leftsum+rightsum;

        if(root.left!=null && root.right!=null && lrsum!=root.data) ans[0]=false;

        return leftsum+rightsum+root.data;



    }

    public static void main(String[] args) {
        Node root=new Node(10);
        Node left=new Node(4);
        Node right=new Node(2);
        root.left=left;
        root.right=right;

        left.left=new Node(2);
        left.right=new Node(2);

        Node root2=new Node(4);

        int ans=solve(root2);
        System.out.println("ans = " + ans);


    }
}
