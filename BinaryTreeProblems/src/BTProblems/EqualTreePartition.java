package BTProblems;

public class EqualTreePartition {
    public static int solve(Node A) {

        if(A==null) return 0;

        int total_sum=sum(A);

        if(total_sum%2==1) return 0;

        Boolean[] ans = new Boolean[1];

        ans[0] = false;
        helper(A,ans,total_sum);

        if(ans[0]==true) return 1;

        return 0;

    }

    public static int helper(Node root,Boolean[] ans,int total_sum){

        if(root==null) return 0;

        int left_sum=helper(root.left,ans,total_sum);
        int right_sum=helper(root.right,ans,total_sum);

        if(left_sum==(total_sum/2) || right_sum==(total_sum/2)){
            ans[0] = true;
        }


        return left_sum+right_sum+root.data;


    }

    public static int sum(Node root){

        if(root==null) return 0;

        return sum(root.left)+sum(root.right)+root.data;
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        Node left=new Node(3);
        Node right=new Node(7);
        root.left=left;root.right=right;

        Node left1=new Node(4);
        Node right1=new Node(6);
        left.left=left1;
        left.right=right1;

        Node left3=new Node(5);
        right.left=left3;

        Node right3=new Node(6);
        right.right=right3;

        int ans=solve(root);

        System.out.println(ans);


    }


}
