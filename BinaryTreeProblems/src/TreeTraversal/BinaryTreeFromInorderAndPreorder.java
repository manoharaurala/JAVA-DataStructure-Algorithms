package TreeTraversal;

import java.util.*;
public class BinaryTreeFromInorderAndPreorder {
    static HashMap<Integer,Integer>hm;
    static {
        hm=new HashMap<Integer,Integer>();
    }
    public static Node buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        int prestart=0;
        int preend=A.size()-1;

        int instart=0;
        int inend=B.size()-1;

        for(int i=0;i<=inend;i++){

            hm.put(B.get(i),i);
        }

        Node root=binaryTree(A,B,prestart,preend,instart,inend);
        return root;
    }

    public static Node binaryTree(ArrayList<Integer> A, ArrayList<Integer> B,int prestart,int preend,int instart,int inend){
        if(inend<instart) return null;
        int root_val=A.get(prestart);
        int root_index=hm.get(root_val);
        Node root=new Node(root_val);
        int x=root_index+prestart-instart;
        root.left=binaryTree(A,B,prestart+1,x,instart,root_index-1);
        root.right=binaryTree(A,B,x+1,preend,root_index+1,inend);

        return root;

    }


    public static int linearsearch(int key,ArrayList<Integer> a){
        int n=a.size();
        for(int i=0;i<n;i++){

            if(key==a.get(i)) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList(10,20,40,50,30,60));
        ArrayList<Integer>B=new ArrayList<Integer>(Arrays.asList(40,20,50,10,60,30));
        Node root=buildTree(A,B);

        System.out.println(root.data);
    }
}
