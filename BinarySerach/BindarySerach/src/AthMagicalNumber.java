import java.util.*;
public class AthMagicalNumber {

    final static long mod=1000000007;
    public static int solve(int A, int B, int C) {

        long n=(long)A*Math.min(B,C);
        long left=1;
        long right=n;

        long ans=-1;
        long lcm=cal_lcm(B,C);
        // System.out.print(lcm);

        while(left<=right){

            long mid=(left+right)/2;
            mid=mid;
            long count=count_magic(mid,B,C,lcm);

            if(count>A){
                right=mid-1;
                right=right;
            }

            if(count<A){
                left=mid+1;
                left=left;
            }

            if(count==A){
                ans=mid;
                right=mid-1;
                right=right;
            }
        }
        ans=ans%mod;
        return  (int)ans;

    }

    public static long count_magic(long x,long b,long c,long lcm){


        long magic=(x/b)+(x/c)-(x/lcm);
        magic=magic;

        return magic;

    }

    public static long cal_lcm(long b,long c){

        long gc = gcd(b, c);
        long lcm = ((b / gc) * c);
        return lcm;

    }

    public static long gcd(long a,long b){

        if(b==0) return a%mod;

        return gcd(b,a%b)%mod;

    }

    public static void main(String[] args) {
        int A=426344489;
        int B=36067;
        int C=29025;

        int ans=solve(A,B,C);
        System.out.println(ans);
    }
}
