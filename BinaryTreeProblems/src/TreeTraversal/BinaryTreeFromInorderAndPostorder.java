package TreeTraversal;

import java.util.*;
public class BinaryTreeFromInorderAndPostorder {

    static HashMap<Integer,Integer>hm;
    static {
        hm=new HashMap<Integer,Integer>();
    }


    public static Node buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {


        int postart=0;
        int posend=B.size()-1;


        int instart=0;
        int inend=A.size()-1;

        for(int i=0;i<=inend;i++){

            hm.put(A.get(i),i);
        }

        Node root=binaryTree(A,B,instart,inend,postart,posend);
        return root;

    }

    public static Node binaryTree(ArrayList<Integer> A, ArrayList<Integer> B,int instart,int inend,int postart,int posend){
        if(inend<instart) return null;
        int root_val=B.get(posend);
        int root_index=hm.get(root_val);
        Node root=new Node(root_val);
        int x=root_index+postart-instart-1;
        root.left=binaryTree(A,B,instart,root_index-1,postart,x);
        root.right=binaryTree(A,B,root_index+1,inend,x+1,posend-1);

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

        ArrayList<Integer>A=new ArrayList<>(Arrays.asList(4,2,7,5,1,3,6));

        ArrayList<Integer>B=new ArrayList<>(Arrays.asList(4,7,5,2,6,3,1));
        Node root=buildTree(A,B);
        System.out.println(root.data);
        
    }
}
