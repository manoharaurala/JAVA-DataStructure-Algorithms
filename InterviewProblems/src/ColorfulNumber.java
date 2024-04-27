import java.util.HashSet;

public class ColorfulNumber {
    public static int colorful(int A) {

        String string=String.valueOf(A);

        HashSet<Integer> hs=new HashSet<Integer>();

        int n=string.length();

        for(int i=0;i<n;i++){

            for(int j=i+1;j<=n;j++){

                String temp=string.substring(i,j);
                int product=1;

                char[] ch=temp.toCharArray();

                for(int k=0;k<ch.length;k++){
                    product=product*Character.getNumericValue(ch[k]);
                }

                if(hs.contains(product)) return 0;

                hs.add(product);


            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int num = 99;
        System.out.println(colorful(num)); // Output: 1

        num = 3245;
        System.out.println(colorful(num)); // Output: 0
    }
}
