package BTProblems;

public class BTInvert {

    public static void invertBT(Node root){
        
        if(root==null) return;
        
       Node temp=root.left;
       root.left=root.right;
       root.right=temp;
       
       invertBT(root.left);
       invertBT(root.right);
       
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

        invertBT(root);

        System.out.println(root.data);


    }
}
