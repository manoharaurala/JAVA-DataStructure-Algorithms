import java.util.List;

public class Nby3RepeatNumber {


    public static int repeatedNumber(final List<Integer> a) {

        int candidate1=0;
        int count1=0;

        int candidate2=0;
        int count2=0;

        for (int num : a) {
        if (num == candidate1) {
            count1++;
        } else if (num == candidate2) {
            count2++;
        } else if (count1 == 0) {
            candidate1 = num;
            count1 = 1;
        } else if (count2 == 0) {
            candidate2 = num;
            count2 = 1;
        } else {
            count1--;
            count2--;
        }
    }

    // Step 2: Count occurrences of the candidates

        count1 = 0;
        count2 = 0;

        for(int num : a) {
        if (num == candidate1) {
            count1++;
        } else if (num == candidate2) {
            count2++;
        }
    }

    // Step 3: Check if candidates are majority elements
        if (count1 > a.size() / 3) return candidate1;
        if (count2 > a.size() / 3) return candidate2;

        return -1; // No majority element found




        }



}
