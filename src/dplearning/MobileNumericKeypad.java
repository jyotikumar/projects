package learn.ds.dp;

import java.util.Arrays;

public class MobileNumericKeypad {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        int n=5;

        System.out.println("Recursive solution is "+countCombination(arr,n));
        System.out.println("DP solution is "+ccDP(arr,n));


    }

    private static int ccDP(int[][] arr, int n) {
        int sum =0;
        int[][] store = new int[n][10];//my store
        Arrays.fill(store[0],1);
        int m=arr.length;
        int l=arr[0].length;

        for(int t=1;t<n;t++){
            for(int i =0;i<m;i++){
                for(int j=0;j<l;j++){
                    int x = arr[i][j];
                    if(x !=-1){
                        int k = store[t-1][x] +
                                (j+1 < l && isValid(arr[i][j+1]) ? store[t-1][arr[i][j+1]] : 0) +
                                (j-1 >= 0 && isValid(arr[i][j-1]) ? store[t-1][arr[i][j-1]] : 0) +
                                (i+1 < m && isValid(arr[i+1][j]) ? store[t-1][arr[i+1][j]] :0)+
                                (i-1 >= 0 && isValid(arr[i-1][j]) ? store[t-1][arr[i-1][j]] : 0);

                        store[t][x] = k; // filling up store

                        if(t == n-1){
                            sum = sum+k;
                        }

                    }

                }
            }

        }
        return sum;
    }

    private static boolean isValid(int i) {
        if(i == -1) return false;
        return true;
    }

    private static int countCombination(int[][] arr, int n) {
        int sum=0;
        int[][] store = new int[n][10];
        Arrays.fill(store[0],1);
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                sum = sum+count(arr,i,j,n-1);
            }
        }
        return sum;
    }

    private static int count(int[][] arr, int i, int j, int s) {
        int n=arr.length;
        int m=arr[0].length;
        if( i >= n || i < 0 || j >= m || j<0) return 0;
        if(arr[i][j] == -1) return 0;
        if(s == 0) return 1;

        return count(arr,i,j,s-1)+
                count(arr,i,j+1,s-1)+
                count(arr,i,j-1,s-1)+
                count(arr,i+1,j,s-1)+
                count(arr,i-1,j,s-1);

    }
}
