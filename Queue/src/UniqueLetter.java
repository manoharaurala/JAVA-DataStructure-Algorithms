import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class UniqueLetter {

    public static String solve(String A) {
        StringBuilder stringBuilder=new StringBuilder();
        Queue<Character>queue=new ArrayDeque<Character>();

        int n=A.length();
        queue.add(A.charAt(0));
        stringBuilder.append(A.charAt(0));
        for(int i=1;i<n;i++){
            char ch=A.charAt(i);
            if(!queue.isEmpty() && ch==queue.peek()){
                queue.remove();
                stringBuilder.append(queue.peek());
                continue;
            }
            if(queue.isEmpty()){
                stringBuilder.append("#");
            }
            else {
                stringBuilder.append(queue.peek());
                queue.add(ch);
            }


        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str= "jyhrcwuengcbnuchctluxjgtxqtfvrebveewgasluuwooupcyxwgl";

        String ans=solve(str);
        System.out.println("ans = " + ans);
    }
}
