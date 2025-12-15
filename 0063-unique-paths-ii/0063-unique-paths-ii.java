class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows=obstacleGrid.length;
        int columns=obstacleGrid[0].length;
        int[][] dp=new int[rows][columns];
        return helper(obstacleGrid,rows,columns,0,0,dp);


        }
    public int helper(int[][] arr,int r,int c,int cr,int cc,int[][] dp){
        //base cases
        if(cr==r-1 && cc==c-1 && arr[cr][cc]!=1){
            return 1;
        }
        if(cr==r || cc==c || arr[cr][cc]==1){
            return 0;
        }
        if(dp[cr][cc]!=0)return dp[cr][cc];

        int right=helper(arr,r,c,cr,cc+1,dp);
        int down=helper(arr,r,c,cr+1,cc,dp);
        dp[cr][cc]=right+down;
        return right+down;
    }
}