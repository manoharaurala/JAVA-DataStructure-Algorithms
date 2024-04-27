public class KthEleExistorNot {

    public static boolean kExistOrNot(ListNode head,int key){

        ListNode temp=head;

        while (temp!=null){
            if(temp.val==key) return true;
            temp=temp.next;
        }

        return false;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(10);

        ListNode ele1=new ListNode(20);


        ListNode ele2=new ListNode(30);

        ListNode ele3=new ListNode(40);

        head.next=ele1;ele1.next=ele2;ele2.next=ele3;

        boolean ans=kExistOrNot(head,30);
        System.out.println("ans = " + ans);

    }
}
