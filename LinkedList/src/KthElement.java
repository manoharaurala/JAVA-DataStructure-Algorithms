import java.util.Arrays;

public class KthElement {

    public static int findK(ListNode head,int k){

        ListNode temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }

        return temp.val;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(10);

        ListNode ele1=new ListNode(20);


        ListNode ele2=new ListNode(30);

        ListNode ele3=new ListNode(40);

        head.next=ele1;ele1.next=ele2;ele2.next=ele3;

        int ans=findK(head,3);
        System.out.println("ans = " + ans);


    }
}
