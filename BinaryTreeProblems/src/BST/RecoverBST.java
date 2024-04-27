package BST;

import java.util.*;
public class RecoverBST {

    public static ArrayList<Integer> recoverTree(Node A) {

        ArrayList<Integer> ret=new ArrayList<Integer>();
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
        hm.put("first",-1);
        hm.put("middle",-1);
        hm.put("last",-1);
        hm.put("prev",Integer.MIN_VALUE);
        inorder(A,hm);

        if(hm.get("last")==-1) {

            ret.add(hm.get("first"));
            ret.add(hm.get("middle"));
        }

        else {
            ret.add(hm.get("first"));
            ret.add(hm.get("last"));

        }

        return ret;

    }

    public static void inorder(Node root,HashMap<String,Integer>hm){


        Node cur=root;

        while (cur!=null){

            if(cur.left==null) {
                int prev = hm.get("prev");

                if (cur.data < prev) {
                    if (hm.get("first") == -1) {
                        hm.put("first", prev);
                        hm.put("middle", cur.data);

                    }
                    else {
                        hm.put("last", cur.data);
                    }


                }
                hm.put("prev", cur.data);
                cur=cur.right;
            }
            else {
                    Node temp=cur.left;

                    while (temp.right!=null && temp.right!=cur){

                        temp=temp.right;
                    }

                    if(temp.right==null){
                        temp.right=cur;
                        cur=cur.left;
                    }

                    if(temp.right==cur) {

                        temp.right = null;

                        int prev = hm.get("prev");

                        if (cur.data < prev) {
                            if (hm.get("first") == -1) {
                                hm.put("first", prev);
                                hm.put("middle", cur.data);
                            } else {
                                hm.put("last", cur.data);
                            }


                        }
                        hm.put("prev", cur.data);
                        cur=cur.right;

                    }






                }


            }


        }


    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(1);

        ArrayList<Integer>arr=recoverTree(root);
        System.out.println("arr = " + arr);

    }
}
