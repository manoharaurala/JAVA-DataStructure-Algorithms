package Cache;

import java.util.HashMap;

public class LRUCache {

    public class ListNode{
        int key;
        int value;
        ListNode prev;
        ListNode next;

        ListNode(int key,int value){
            this.key=key;
            this.value=value;
            prev=null;
            next=null;

        }
    }

    ListNode head=new ListNode(0,0);
    ListNode tail=new ListNode(0,0);
    HashMap<Integer,ListNode> hm=new HashMap<Integer,ListNode>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key){

        if(hm.containsKey(key)){
            ListNode temp=hm.get(key);

            removeNode(temp);
            insertBack(temp);
             return temp.value;

        }


        else{
            return -1;
        }
    }


    public void removeNode(ListNode node){
        hm.remove(node.key);

        ListNode prev=node.prev;
        ListNode next=node.next;

        prev.next=next;
        next.prev=prev;

        node.next=null;
        node.prev=null;

    }

    public void insertBack(ListNode node){

        hm.put(node.key,node);
        ListNode prev=tail.prev;
        prev.next=node;
        node.prev=prev;

        node.next=tail;
        tail.prev=node;

    }

    public void set(int key,int value){

        if(hm.containsKey(key)){

            ListNode temp=hm.get(key);
            removeNode(temp);
        }

        if(hm.size()==capacity){
            removeNode(head.next);
        }

        ListNode newNode=new ListNode(key, value);
        insertBack(newNode);
    }
}
