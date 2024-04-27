package BTProblems;

import java.util.ArrayDeque;
import java.util.Queue;

public class NextPointerBT {
    public void connect(TreeLinkNode root) {


        Queue<TreeLinkNode>queue=new ArrayDeque<TreeLinkNode>();

        queue.add(root);

        root=levelOrder(root,queue);

    }


    void populateNextPointers(TreeLinkNode root){

        if(root==null) return;

        TreeLinkNode dummy=new TreeLinkNode(-1);
        TreeLinkNode temp=dummy;

        TreeLinkNode cur=root;


        while (cur!=null){

            if(cur.left!=null){

                temp.next=cur.left;
                temp=temp.next;
            }

            if (cur.right!=null){
                temp.next=cur.right;
                temp=temp.next;
            }

            cur=cur.next;

            if(cur==null){

                cur=dummy.next;
                dummy.next=null;

                temp=dummy;
            }







        }






    }

    public TreeLinkNode levelOrder(TreeLinkNode root,Queue<TreeLinkNode>queue){

        if(root==null) return null;

        while (queue.size()>0){

            int n=queue.size();

            TreeLinkNode prev=null;

            for(int i=0;i<n;i++){

                TreeLinkNode out=queue.remove();

                if(prev!=null) prev.next=out;

                if(out.left!=null)queue.add(out.left);
                if(out.right!=null)queue.add(out.right);

                prev=out;

            }



        }


        return root;




    }


}
