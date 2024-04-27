import java.util.*;
public class AddTwoNumbersasLists {

    public ListNode addTwoNumbers(ListNode A, ListNode B){

        ListNode head=new ListNode(-1);
        ListNode current=head;

        ListNode temp1=A;
        ListNode temp2=B;

        int carry=0;

        while (temp1!=null || temp2!=null){

            int sum=carry;

            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }

            if(temp2!=null){
                sum+=temp2.val;
                temp2=temp2.next;
            }

            ListNode newNode=new ListNode(sum%10);
            current.next=newNode;
            current=newNode;
            carry=sum/10;

        }

        if(carry>0){
            ListNode newNode=new ListNode(carry);
            current.next=newNode;
            current=newNode;
        }

        return head.next;


    }

    public static void main(String[] args) {



    }
}
