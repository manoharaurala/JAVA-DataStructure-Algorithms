public class PrintLL {

    public static void printNode(ListNode head){

        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val + "-->");
            temp=temp.next;
        }
    }
}
