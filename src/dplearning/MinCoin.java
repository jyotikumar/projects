package learn.ds.dp;

import java.util.Arrays;

public class MinCoin {
    public static void main(String[] args) {
          int[] arr = {1,5,6,9};
          int s=14;
          int result = minCoinRec(arr,arr.length,s);
        System.out.println("Recursive solution result is "+(result==Integer.MAX_VALUE ? 0: result));
        System.out.println("Dp solution is "+minCoinDP(arr,arr.length,s));
        System.out.println("Dp 2 solution is "+mcDP(arr,arr.length,s));
    }

    private static int minCoinDP(int[] arr,int n, int s) {
        int[] c = new int[s+1];
        for(int i=1;i<=s;i++){ //for each sum

              for(int j=0;j<n;j++){ //for each coins
                  int min = c[i];
                  int x = i / arr[j]; //get quotient - gives number of coins req for a sum i with that given denomination.
                  int y =  i % arr[j]; //get remainder - it gives the left over sum
                  /*
                     x != 0 - if coin denomination is more than given sum do nothing with that coin.
                   */
                  if( y > 0 && x !=0 && c[y] !=0){
                      c[i] = x+c[y];  //x is the number of coins required for a denomination j + look for min coins required for remaining sum c[y]
                  }else if( y == 0){  //y==0 when there is no left over sum then for a denomination j ,quotient will the coins req to make a sum i
                      c[i] = x;
                  }

                  if(min<c[i] && min!=0){
                      c[i] = min;
                  }

              }
        }
        return c[s];
    }

    private static int minCoinRec(int[] arr, int length, int s) {
        if(s==0) return 0;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            if(s-arr[i] >= 0) {
                int cur = minCoinRec(arr, length, s - arr[i]);
                if(cur != Integer.MAX_VALUE && cur+1 < res){
                    res = cur+1;
                }
            }
        }
        return res;
    }

    private static int mcDP(int[] arr,int n,int s){
        int[] t = new int[s+1];
        Arrays.fill(t, Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            if(arr[i] <= s){
                t[arr[i]] =1;
            }
        }

        for(int i=1;i<=s;i++){
            for(int j=0;j<n;j++){
                if(arr[j] <= i){
                     if(t[i-arr[j]] != Integer.MAX_VALUE && t[i-arr[j]] + 1 < t[i]){
                         t[i] = t[i-arr[j]] +1;
                     }
                }
            }
        }
        return t[s];
    }
}
