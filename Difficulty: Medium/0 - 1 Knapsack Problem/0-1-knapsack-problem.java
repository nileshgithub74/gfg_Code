class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // code here
        int n = wt.length;
        
        
        // dp array
         int[][] dp = new int[n+1][W+1]; 
         
         
         for(int i =0; i <n+1; i++){
             for(int j =0; j <W+1; j++){
                 
                 // if n ==0 or w ==0 return 0;   n -> i and W -> j
                 
                 if( i == 0 || j ==0){
                     dp[i][j] =0;
                 }
                 
                 
                 /// if wt > W
                 
                else  if( wt[i-1] > j){
                     dp[i][j] = dp[i-1][j];
                 }
                 else{
                     
                     
                     dp[i][j] = Math.max(
                                  
                                  dp[i-1][j],
                                  val[i-1] + dp[i-1][j - wt[i-1]]
                         
                         );
                     
                     
                     
                     
                 }
                 
                 
                 
                 
             }
         }
         
         return dp[n][W];
         
        
    }
}
