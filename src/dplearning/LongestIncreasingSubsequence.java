
package learn.ds.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    private static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
       // int[] arr = {3,7,1,5,2,6};////{3,10,2,1,8};//{3,7,1,5,2,6};
      //  int[] arr ={ 50,3,10,7,40,1};
        int[] arr = {3,10,2,1,8};
        System.out.println("Recursive method1 : lis length is "+findLIS(arr));
        System.out.println("Recursive method2 : lis length is "+lisRec(arr,arr.length,0));
        System.out.println("DP method is "+lisDP(arr));
    }

    private static int lisDP(int[] arr) {
        int n= arr.length;
        int[] t = new int[n]; // my store
        Arrays.fill(t,1);
        int max = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j] && 1+t[j] > t[i]){
                    t[i] = 1 + t[j];
                }
            }
            max = t[i] > max ? t[i] :max;
        }

       /* for(int k=0;k<n;k++){
            max = t[k] > max ? t[k] :max;
        }*/
        return max;
    }

    private static int lisRec(int[] arr, int n,int i) {
        int res = 0;
        for(int k = i+1;k<arr.length;k++){
            if(arr[i] < arr[k]){
                int curr = 1+lis(arr,k);
                if(curr > res) res = curr;
            }
        }
        return res;
    }

    private static int findLIS(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i<arr.length;i++){
            int curr = 1+lis(arr,i);
            max = curr > max ? curr : max;
        }
        return max;
    }

    private static int lis(int[] arr, int i) {
        int res = 0;
        for(int k = i+1;k<arr.length;k++){
            if(arr[i] <arr[k]){
                int curr = 1+lis(arr,k);
                if(curr > res) res = curr;
            }
        }
        return res;
    }

}