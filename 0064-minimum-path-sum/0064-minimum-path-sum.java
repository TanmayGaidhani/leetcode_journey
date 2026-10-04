class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][]=new int[m][n];
        dp[0][0] = grid[0][0];
        //first row initialization
        for(int c = 1; c<n; c++){
            dp[0][c] = dp[0][c-1] + grid[0][c];
        }
        //first col initialization
        for(int r = 1; r<m; r++){
            dp[r][0] = dp[r-1][0] + grid[r][0];
        }
        for(int i=1;i < m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            
            }
        }
        return dp[m-1][n-1];
    }
}