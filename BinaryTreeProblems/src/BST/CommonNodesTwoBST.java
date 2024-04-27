package BST;

import java.util.ArrayDeque;
import java.util.Queue;

public class CommonNodesTwoBST {

    public int solve(Node A, Node B) {

        Queue<Node> aqueue=new ArrayDeque<Node>();
        Queue<Node> bqueue=new ArrayDeque<Node>();

        Node curA=A;
        Node curB=B;

        aqueue.add(curA);
        bqueue.add(curB);

        while ((curA!=null||!aqueue.isEmpty()) &&(curB!=null || !bqueue.isEmpty())){

            curA=aqueue.remove();
            curB=bqueue.remove();

        }



    }
}
