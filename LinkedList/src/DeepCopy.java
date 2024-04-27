import java.util.*;
public class DeepCopy {

    class RandomListNode{
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    }
    public RandomListNode copyRandomList(RandomListNode node) {

        RandomListNode head=node;
        RandomListNode temp=head;

        RandomListNode temp1;

        while (temp!=null){

            temp1=new RandomListNode(temp.label);
            temp1.next=temp.next;
            temp.next=temp1;
            temp=temp.next.next;
        }

        RandomListNode retHead=head.next;

        temp=head;

        while (temp!=null){
            temp1=temp.next;
            if(temp.random!=null){
                temp1.random=temp.random.next;

            }
            temp=temp.next.next;

        }

        temp=head;
        temp1=head.next;

        while (temp!=null){
            temp1=temp.next;
            temp.next=temp1.next;

            if(temp1.next!=null){
                temp1.next=temp1.next.next;
            }

            temp=temp.next;
            temp1=temp1.next;
        }

        return retHead;



    }

    public static void main(String[] args) {



    }
}
