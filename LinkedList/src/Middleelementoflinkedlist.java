import java.util.*;
public class Middleelementoflinkedlist {

    public static int solve(ListNode A) {

       ListNode slow=A;
       ListNode fast=A;


      while (fast!=null && fast.next!=null && fast.next.next!=null){
          fast=fast.next.next;
          slow=slow.next;
      }

      if(fast.next!=null) slow=slow.next;


       return slow.val;
    }

    public static void main(String[] args) {
        ListNode A=new ListNode(46);
        ListNode B=new ListNode(76);
        ListNode C=new ListNode(35);
        ListNode D=new ListNode(25);


        A.next=B;B.next=C;C.next=D;
        int ans=solve(A);
        System.out.println(ans);
    }
}
