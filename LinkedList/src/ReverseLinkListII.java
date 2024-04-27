public class ReverseLinkListII {

    public static ListNode reverseBetween(ListNode head, int B, int C) {

        if(head==null || head.next==null || B==C){
            return head;
        }

        int n=LinkedListLength.length(head);

        ListNode curr=head;
        ListNode prev=null;
        int count=0;

        while (curr!=null){

            count++;
            if(count==B){
                break;
            }

            prev=curr;
            curr=curr.next;

        }

        prev.next=null;
        ListNode head1=head;
        ListNode head2=curr;

        for(int i=B;i<C;i++){
            prev=curr;
            curr=curr.next;
        }

        prev.next=null;
        ListNode head3=curr.next;

        head2=ReverseLL.reverse(head2);

        if(head1!=null){
            head1=head2;
        }


        return head1;






    }



    public static void main(String[] args) {
        ListNode A=new ListNode(1);

        ListNode B=new ListNode(2);

        ListNode C=new ListNode(3);

        //ListNode D=new ListNode(4);

        A.next=B;B.next=C;//C.next=D;
        int start=1;
        int end=2;


        ListNode ans=reverseBetween(A,start,end);

        PrintLL.printNode(ans);
    }
}
