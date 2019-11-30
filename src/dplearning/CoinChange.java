package learn.ds.dp;

public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int s = 4;
        System.out.println(changeRec(arr,arr.length,s));
        System.out.println("DP sol is "+changeDP(arr,arr.length,s));
    }

    private static int changeDP(int[] arr, int length, int s) {
        int[] t = new int[s+1]; // t for table
        t[0] = 1;
        for(int i=0;i<length;i++){ //i for coins
            for(int j=1;j<=s;j++){ // j for sum
                int x = j - arr[i];
                int temp = t[j];
                if(x >= 0){
                    t[j] = temp + t[x];
                }
            }
        }
        return t[s];
    }

    private static int changeRec(int[] arr,int n ,int s) {
        if(s==0) return 1;
        if(n==0) return 0;
        if(s<0) return 0;
        return changeRec(arr,n,s-arr[n-1]) + changeRec(arr,n-1,s);
    }
}
