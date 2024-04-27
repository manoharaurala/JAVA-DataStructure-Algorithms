import java.util.*;
public class SortList {

    public static ListNode sortList(ListNode A) {

        if(A==null || A.next==null) return A;

        ListNode middle=getmiddle(A);
        ListNode h1=A;
        ListNode h2=middle.next;
        middle.next=null;

        h1=sortList(h1);
        h2=sortList(h2);
        return mergeTwoLists(h1,h2);
    }

    public static ListNode getmiddle(ListNode A) {

        ListNode fast=A;
        ListNode slow=A;
        int count=0;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            count++;
        }


        return slow;
    }

    public static ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode head1=A;
        ListNode head2=B;
        ListNode head3=new ListNode(-1);
        ListNode temp=head3;

        while(head1!=null && head2!=null){

            if(head1.val<=head2.val){

                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            }

            else{

                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }

        if(head1!=null) temp.next=head1;
        if(head2!=null) temp.next=head2;

        return head3.next;
    }

    public static void main(String[] args) {
        ListNode A=new ListNode(3);
        ListNode B=new ListNode(4);
        ListNode C=new ListNode(2);
        ListNode D=new ListNode(8);
        A.next=B;B.next=C;C.next=D;

        ListNode ans=sortList(A);
    }
}
