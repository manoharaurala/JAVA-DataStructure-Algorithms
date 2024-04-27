package ViewsandTypes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class DeSerliazeBT {

    public Node solve(ArrayList<Integer> A) {

        if(A.size()==0) return null;

        Node root=new Node(A.get(0));

        if(A.size()==1) return root;
        Queue<Node> queue=new ArrayDeque<Node>();
        queue.add(root);
        int index=1;
        while (!queue.isEmpty()){

            Node cur=queue.remove();

            int left_val=A.get(index++);
            int right_val=A.get(index++);

            Node left;
            if(left_val!=-1){
                left=new Node(left_val);
                cur.left=left;
                queue.add(left);
            }
            Node right;
            if(right_val!=-1){
                right=new Node(right_val);
                cur.right=right;
                queue.add(right);

            }

        }

        return root;
    }
}
