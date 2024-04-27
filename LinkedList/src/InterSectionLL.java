public class InterSectionLL {

    public ListNode getIntersectionNode(ListNode A, ListNode B) {

        int alen=LinkedListLength.length(A);
        int blen=LinkedListLength.length(B);

        ListNode tempA=A;
        ListNode tempB=B;

        while(alen>blen){
            tempA=tempA.next;
            alen--;
        }

        while (blen>alen){
            tempB=tempB.next;
            blen--;

        }


        while(tempA!=null || tempB!=null){

            if(tempA==tempB){
                return tempA;
            }

            tempA=tempA.next;
            tempB=tempB.next;
        }


        return null;

    }


    public static void main(String[] args) {

    }
}
