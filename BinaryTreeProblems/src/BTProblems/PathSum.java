package BTProblems;

public class PathSum {
    public int hasPathSum(Node A, int B) {

        if(A==null) return 0;

        if(A.left==null && A.right==null && A.data==B){
            return 1;
        }

       int ans1=hasPathSum(A.left,B-A.data);
       int ans2= hasPathSum(A.right,B-A.data);

       if(ans1==1 || ans2==1) return 1;

       return 0;
    }
}
