public class InversionCount2 {

    public static void main(String[] args) {
        int []arr={2000000000,2000000000,-2000000000};
        System.out.println(solve(arr));
    }
    public static int solve(int[] A) {

        int n=A.length;
        int count=0;

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

               long temp1=A[i];
               long temp2=(long)A[j];
                temp2*=2;
               if(temp1>temp2){
                   count++;
               }
            }
        }

        return count;
    }
}
