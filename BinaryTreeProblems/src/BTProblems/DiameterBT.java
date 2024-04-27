package BTProblems;

public class DiameterBT {

    public static int solve(Node A) {

        int dia[]=new int[1];
        dia[0]=0;

        height(A,dia);

        return dia[0];

    }

    public static int height(Node A,int dia[]){


        if(A==null) return -1;

        int lh=height(A.left,dia);
        int rh=height(A.right,dia);

        dia[0]=Math.max(dia[0],lh+rh+2);

        return Math.max(lh,rh)+1;

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
        right.right=right3;

        int ans=solve(root);

        System.out.println(ans);
    }
}
