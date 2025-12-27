class Solution {
    public static int noOfPath(int cr,int cc,int[][] dp,int m,int n){
        if(cc>=n-1 || cr>=m-1)return 1;

        if(dp[cr][cc]!=0)return dp[cr][cc];

        int right=noOfPath(cr,cc+1,dp,m,n);

        int down=noOfPath(cr+1,cc,dp,m,n);

        dp[cr][cc]=right+down;

        return dp[cr][cc];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return noOfPath(0,0,dp,m,n);
    }
}