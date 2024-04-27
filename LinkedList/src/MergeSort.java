public class MergeSort {

    public static ListNode merge(ListNode head1,ListNode head2) {
        ListNode head3=new ListNode(-1);
        ListNode temp=head3;

        while ((head1!=null) && (head2!=null)){

            if(head1.val<=head2.val){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            } else if (head2.val<head1.val) {
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;

            }

        }

        if(head1!=null) temp.next=head1;

        if(head2!=null) temp.next=head2;

        return head3.next;
    }

    public static ListNode middleNode(ListNode head){

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    public static ListNode sort(ListNode head){

        if(head==null || head.next==null) return head;
            ListNode middle=middleNode(head);
            ListNode head1=head;
            ListNode head2=middle.next;
            middle.next=null;

            head1=sort(head1);
            head2=sort(head2);

            return merge(head1,head2);



    }

    public static void main(String[] args) {
        ListNode A=new ListNode(46);
        ListNode B=new ListNode(76);
        ListNode C=new ListNode(35);
        ListNode D=new ListNode(25);
        A.next=B;B.next=C;C.next=D;

       ListNode head= sort(A);
       PrintLL.printNode(head);
    }


}
