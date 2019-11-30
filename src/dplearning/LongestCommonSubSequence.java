package learn.ds.dp;

/**
 * https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
 *
 */
public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String a = "AGGTAB";//"ABCDGH";
        String b="GXTXAYB"; //"AEDFHR";

        int res = lCSRec(a.toCharArray(),b.toCharArray(),a.length()-1,b.length()-1);
        System.out.println("longest common subsequence length is "+res);
        System.out.println(lCSMyMethod(a.toCharArray(),b.toCharArray()));
        System.out.println(lcsDp(a.toCharArray(),b.toCharArray(),a.length(),b.length()));
    }

    private static int lcsDp(char[] s1, char[] s2, int m, int n) {
        int[][] t = new int[m+1][n+1];

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(s1[i-1] == s2[j-1]) {
                    t[i][j] = 1 + t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[m][n];
    }

    private static int lCSMyMethod(char[] s1, char[] s2) {
        int count =0;
        int k =0;
        for(int i=0;i<s2.length;i++){
            int j=k;
            for(;j<s1.length;j++){
                if(s2[i] == s1[j]){
                    k=j+1;
                    count++;
                    break;
                }
            }
        }
      return count;
    }

    private static int lCSRec(char[] s1, char[] s2, int m, int n) {
        if(m<0 || n < 0) return 0;
        if(s1[m] == s2[n]) return 1+ lCSRec(s1,s2,m-1,n-1);
        return Math.max(lCSRec(s1,s2,m-1,n),lCSRec(s1,s2,m,n-1));
    }


}
