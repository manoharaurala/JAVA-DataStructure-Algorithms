public class DeleteNode {

    public static ListNode deleteNode(ListNode head,int val){

        if(head.val==val){
            return head.next;
        }

        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            if(temp.val==val){
                ListNode nextNode=temp.next;
                prev.next=nextNode;
                break;
            }

            prev=temp;
            temp=temp.next;

        }

        return head;


    }

    public static void printNode(ListNode head){

        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val + "-->");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(10);

        ListNode ele1=new ListNode(20);


        ListNode ele2=new ListNode(30);

        ListNode ele3=new ListNode(40);

        head.next=ele1;ele1.next=ele2;ele2.next=ele3;

        head=deleteNode(head,100);
        printNode(head);
    }
}
