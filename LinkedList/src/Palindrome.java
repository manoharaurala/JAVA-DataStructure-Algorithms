import java.util.Arrays;

public class Palindrome {

    public static boolean checkPalindromeOrNot(ListNode head){

        int n=LinkedListLength.length(head);
        int mid=n/2;

        if(n==1) return true;

        int count=0;
        ListNode temp=head;

        while (temp!=null){

            count++;
            if(count==mid){

                break;
            }
            temp=temp.next;
        }

        ListNode head2=null;
        if(n%2==0){
            head2=temp.next;
            temp.next=null;

        }

        else{

            head2=temp.next.next;
            temp.next=null;
        }


        ListNode head1=ReverseLL.reverse(head);

        while (head1!=null || head2!=null){

            if(head1.val!=head2.val){
                return  false;
            }

            head1=head1.next;
            head2=head2.next;
        }

        return true;


    }

    public static void main(String[] args) {
        ListNode head=new ListNode(10);

        ListNode ele1=new ListNode(10);

       // ListNode ele2=new ListNode(20);

        //ListNode ele3=new ListNode(30);

       // ListNode ele4=new ListNode(10);

       head.next=ele1;
       // ele1.next=ele2;
        //ele2.next=ele3;
      //  ele3.next=ele4;

        boolean ans=checkPalindromeOrNot(head);
        System.out.println("ans = " + ans);
    }


}
