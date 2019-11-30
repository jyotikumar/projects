package learn.ds.dp;

public class Fibonacci {
    public static void main(String[] args) {
        int n= 6;
       int res = fibRec(n);
        System.out.println("fibonacci at elemnet "+n +" is "+res);
        int dpRes = fibDp(n);
        System.out.println("dp result at "+n + " is "+dpRes);
    }

    /*
      Using DP
     */
    private static int fibDp(int n) {
        int[] t = new int[n+1];
        t[0]=0;
        t[1] = 1;
        for(int i=2;i<t.length;i++){
            t[i] = t[i-1] +t[i-2];
        }
        return t[n];
    }

    /*
     Recursive Method
      gives nth element in the fibonacci series
     */
    private static int fibRec(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibRec(n-1)+fibRec(n-2);

    }
}
