public class PalindromeList {
    public static int lPalin(ListNode A) {

        ListNode head=A;
        ListNode temp=head;
        int n=0;

        while(temp!=null){
            n++;
            temp=temp.next;
        }

        if(n==1){
            return 1;
        }



        temp=head;
        for(int i=1;i<n/2;i++){
            temp=temp.next;
        }

        ListNode head2=temp.next;
        ListNode head1=head;
        temp.next=null;

        head1=reverseList(head1);

        if(n%2==1){
            head2=head2.next;
        }

        ListNode temp1=head1;

        ListNode temp2=head2;


        while(temp1!=null || temp2!=null){

            if(temp1.val !=temp2.val){
                return 0;
            }

            temp1=temp1.next;
            temp2=temp2.next;


        }


        return 1;

    }



    public static ListNode reverseList(ListNode A) {

        ListNode head=A;
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){

            ListNode X=temp.next;
            temp.next=prev;
            prev=temp;
            temp=X;

        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode A=new ListNode(1);

        ListNode B=new ListNode(2);

        ListNode C=new ListNode(1);
        A.next=B;B.next=C;

        int ans=lPalin(A);
        System.out.println(ans);

    }
}
