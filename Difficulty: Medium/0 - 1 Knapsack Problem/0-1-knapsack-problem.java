class Solution {
    
    
    
    public int solve(int W, int val[], int wt[], int n, int[][] dp){
        
        
        // best case 
        
        if( n ==0 || W ==0){
        return    dp[n][W] =0;
        }
        
        
        if(dp[n][W]  != -1){
            return dp[n][W];
        }
        
        
        
        
         if( wt[n-1] > W){
            return  dp[n][W] =    solve(W, val, wt, n-1,dp );
        }
        else {
            
            
         return    dp[n][W] =    Math.max( 
                  solve(W, val, wt, n-1,dp),
         
               val[n-1] +   solve(W-wt[n-1], val, wt, n-1,dp));
            
            
            
            
        }
    }
    
    
    
    
    public int knapsack(int W, int val[], int wt[]) {
      
      int n=wt.length;
      
      int[][] dp = new int[n+1][W+1];
      
      
      for(int i =0; i <=n; i++){
          for(int j =0; j <=W; j++){
              dp[i][j] = -1;
          }
      }
      
      
      
      
      return  solve(W, val, wt, n, dp);
        
       
        
        
    }
}
