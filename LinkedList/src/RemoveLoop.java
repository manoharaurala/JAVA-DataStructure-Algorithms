import java.util.*;
public class RemoveLoop {
    public static ListNode solve(ListNode A) {
        ListNode slow=A;
        ListNode fast=A;

        while(!(fast==null || fast.next==null || fast.next.next==null)){

            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) break;
        }

        if(fast==null || fast.next==null || fast.next.next==null){
            return A;
        }

        fast=A;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=null;

        return A;
    }

    public static void main(String[] args) {
        ListNode A=new ListNode(6);
        ListNode B=new ListNode(5);
        ListNode C=new ListNode(5);
        ListNode D=new ListNode(3);
        ListNode E=new ListNode(8);

        A.next=B;B.next=C;C.next=D;D.next=E; E.next=A;
        ListNode ans=solve(A);

        System.out.println(ans);

    }
}
