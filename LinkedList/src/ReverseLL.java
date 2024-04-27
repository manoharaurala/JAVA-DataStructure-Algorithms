public class ReverseLL {

    public static ListNode reverse(ListNode head){

        if(head==null) return head;

        if(head.next==null) return head;

        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){

            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;


    }

    public static void main(String[] args) {
        ListNode head=new ListNode(10);

        ListNode ele1=new ListNode(20);


        ListNode ele2=new ListNode(30);

        ListNode ele3=new ListNode(40);

        head.next=ele1;
        ele1.next=ele2;
        ele2.next=ele3;

        head=reverse(head);
        PrintLL.printNode(head);
    }
}
