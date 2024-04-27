public class ReorderList {

    public static ListNode reorderList(ListNode A) {

        ListNode head1=A;
        ListNode middle=middleNode(A);
        ListNode head2=middle.next;
        middle.next=null;
        head2=ReverseLL.reverse(head2);

        ListNode head= merge(head1,head2);

        return head;

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

    public static ListNode merge(ListNode head1,ListNode head2){

        ListNode head3=new ListNode(-1);
        head3.next=head1;

        ListNode temp=head3;
        boolean flag=true;

        while(head1!=null || head2!=null){

            if(flag){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
                flag=false;
            }
            else{

                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
                flag=true;
            }



        }

        if(head1!=null) temp.next=head1;
        if(head2!=null) temp.next=head2;

        return head3.next;

    }

    public static void main(String[] args) {
        ListNode A=new ListNode(1);
        ListNode B=new ListNode(2);
        ListNode C=new ListNode(3);
        ListNode D=new ListNode(4);
        ListNode E=new ListNode(5);
        A.next=B;B.next=C;C.next=D;D.next=E;
        ListNode head=reorderList(A);

        PrintLL.printNode(head);
    }
}
