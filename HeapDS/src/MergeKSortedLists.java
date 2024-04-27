import java.util.*;
public class MergeKSortedLists implements Comparator<ListNode> {

    public ListNode mergeKLists (ArrayList<ListNode> a) {

        PriorityQueue<ListNode> priorityQueue=new PriorityQueue<ListNode>(new MergeKSortedLists());
        int n=a.size();

        for(int i=0;i<n;i++){
            ListNode head=a.get(i);

            ListNode temp=head;
            while(temp!=null){

                priorityQueue.add(temp);
                temp=temp.next;

            }

        }

        ListNode head=priorityQueue.remove();
        ListNode temp=head;

        while(priorityQueue.size()>0){

            ListNode node=priorityQueue.remove();
            temp.next=node;
            temp=node;
        }

        return head;

    }

    @Override
    public int compare(ListNode x, ListNode y) {

        if (x.val > y.val) return 1;
        if (x.val< y.val) return -1;
        return 0;
    }

}
