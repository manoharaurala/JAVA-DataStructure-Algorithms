package ViewsandTypes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class LevelOrder {
    
    static Queue<Node> q;
    static ArrayList<ArrayList<Integer>> arr;
    static {
        q=new ArrayDeque<Node>();
        arr=new ArrayList<ArrayList<Integer>>();
    }
    
    public static void levelorder_traversal(Node root){
        
        q.add(root);
        
        while(q.size()>0){

            int size= q.size();
            ArrayList<Integer>temp=new ArrayList<Integer>();

            for(int i=0;i<size;i++){

            Node curr=q.peek();
            q.remove();
            temp.add(curr.data);


            if(curr.left!=null) {
                q.add(curr.left);
            }

            if(curr.right!=null){
                q.add(curr.right);
            }
            }

            arr.add(temp);
            
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
        levelorder_traversal(root);
        System.out.println(arr);
        
    }
}
