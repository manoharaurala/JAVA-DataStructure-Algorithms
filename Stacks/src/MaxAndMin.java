import java.util.*;
public class MaxAndMin {

    final static long mod=1000000007;

    public static int solve(ArrayList<Integer> A) {
        long max=0;
        long min=0;
        ArrayList<Integer> NSL=nsl(A);
        ArrayList<Integer> NSR=nsr(A);
        ArrayList<Integer> NLL=nll(A);
        ArrayList<Integer> NLR=nlr(A);
        int n=A.size();
        for(int i=0;i<n;i++){
            int l=NLL.get(i);
            int r=NLR.get(i);
            max+=(long)A.get(i)*(i-l)*(r-i);
        }

        for(int i=0;i<n;i++){
            int l=NSL.get(i);
            int r=NSR.get(i);


            min+=(long)A.get(i)*(i-l)*(r-i);
        }
        long ans=max-min;
        ans=ans%mod;

        return (int) ans;

    }

    private static ArrayList<Integer> nlr(ArrayList<Integer> a) {
        int n=a.size();
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> ret=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            ret.add(n);
        }

        for(int i=n-1;i>=0;i--){
            int temp=a.get(i);
            while(!stack.isEmpty() && a.get(stack.peek())<=temp){
                stack.pop();
            }
            if(!stack.isEmpty()){

                ret.set(i,stack.peek());
            }

            stack.push(i);
        }

        return ret;
    }

    private static ArrayList<Integer> nll(ArrayList<Integer> a) {

        int n=a.size();
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> ret=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            ret.add(-1);
        }

        for(int i=0;i<n;i++){
            int temp=a.get(i);
            while(!stack.isEmpty() && a.get(stack.peek())<=temp){
                stack.pop();
            }
            if(!stack.isEmpty()){

                ret.set(i,stack.peek());
            }

            stack.push(i);
        }

        return ret;
    }

    private static ArrayList<Integer> nsr(ArrayList<Integer> a) {
        int n=a.size();
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> ret=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            ret.add(n);
        }

        for(int i=n-1;i>=0;i--){
            int temp=a.get(i);
            while(!stack.isEmpty() && a.get(stack.peek())>=temp){
                stack.pop();
            }
            if(!stack.isEmpty()){

                ret.set(i,stack.peek());
            }

            stack.push(i);
        }

        return ret;
    }

    private static ArrayList<Integer> nsl(ArrayList<Integer> a) {
        int n=a.size();
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> ret=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            ret.add(-1);
        }

        for(int i=0;i<n;i++){
            int temp=a.get(i);
            while(!stack.isEmpty() && a.get(stack.peek())>=temp){
                stack.pop();
            }
            if(!stack.isEmpty()){

                ret.set(i,stack.peek());
            }

            stack.push(i);
        }

        return ret;

    }


    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(994390,986616,976849,979707,950477,968402,992171,937674,933065,960863,980981,937319,951236,959547,991052,991799,992213,941294,978103,997198,960759,988476,963517,980366,921767,979757,977912,983761,981869,947454,930202,999086,973538,999798,996446,944001,974217,951595,942688,975075,970973,970130,897109,927660,862233,997130,986068,954098,978175,889682,988973,996036,969675,985751,977724,881538,988613,924230,906475,915565,986952,975702,994316,964011,986848,983699,949076,989673,981788,929094,988310,926471,994763,999736,980762,973560,996622,934475,998365,966255,998697,998700,911868,983245,996382,996992,953142,994104,987303,853837,960626,904203,998063,977596,977868,996012,946345,949255,988138,996298,954933,965036,886976,998628,990878,953725,916744,985233,919661,970903,986066));
        int ans=solve(arr);
        System.out.println(ans);


    }
}
