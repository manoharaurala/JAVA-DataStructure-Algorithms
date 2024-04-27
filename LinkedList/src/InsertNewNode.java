public class InsertNewNode {
    public static ListNode insertNode(ListNode head,int val,int index){

        int count=0;
        ListNode temp=head;

        ListNode newNode=new ListNode(val);

     if(index==0){

         newNode.next=head;

         return newNode;
     }

     ListNode prev=null;

     while(temp!=null){

         if(count==index){
             prev.next=newNode;
             newNode.next=temp;
             break;
         }
         prev=temp;
         temp=temp.next;
         count++;
     }

     if(temp==null){
         prev.next=newNode;
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

        head=insertNode(head,25,4);
        printNode(head);
    }
}
