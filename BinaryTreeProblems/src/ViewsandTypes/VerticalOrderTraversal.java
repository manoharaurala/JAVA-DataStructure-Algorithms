package ViewsandTypes;
import java.awt.*;
import java.util.*;
public class VerticalOrderTraversal {
    static Queue<Node>q1;
    static Queue<Integer>q2;
    static{
        q1=new ArrayDeque<Node>();
        q2=new ArrayDeque<Integer>();
    }
    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(Node A) {

        ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>>();

        verticalOrder(A,ret);
        return ret;

    }

    public static void verticalOrder(Node root,ArrayList<ArrayList<Integer>>arr){

        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
        q1.add(root);
        q2.add(0);
        //hm.put(0,root.val);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(q1.size()>0 || q2.size()>0){

            Node curr=q1.remove();
            int level=q2.remove();

            ArrayList<Integer> temp;
            if(hm.containsKey(level)){
                temp=hm.get(level);
            }
            else{
                temp=new ArrayList<Integer>();
            }
            temp.add(curr.data);

            hm.put(level,temp);

            min=Math.min(min,level);
            max=Math.max(max,level);

            if(curr.left!=null){
                q1.add(curr.left);
                q2.add(level-1);
            }

            if(curr.right!=null){
                q1.add(curr.right);
                q2.add(level+1);
            }


        }

        for(int i=min;i<=max;i++){
            ArrayList<Integer> temp=hm.get(i);
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

        ArrayList<ArrayList<Integer>> ret;
        ret=verticalOrderTraversal(root);
        System.out.println(ret);

    }
}
