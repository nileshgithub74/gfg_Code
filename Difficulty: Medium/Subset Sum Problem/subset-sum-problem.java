class Solution {
    
    // static boolean solve(int[] arr, int sum, int n, Boolean[][] dp){
    //     // n==0 || sum ==0;
        
    //   if( n==0)return false;
    //   if(sum ==0)  return true;
      
    //   /// 
      
    //   if(dp[n][sum] != null){
    //       return dp[n][sum] ;
    //   }
      
    //   if(arr[n-1] > sum){
    //       return   dp[n][sum] =   solve(arr,sum, n-1,dp);
    //   }else{
          
    //       return
    //           dp[n][sum]  =     solve(arr, sum, n-1, dp) || solve(arr, sum - arr[n-1], n-1, dp);
          
    //   }
        
        
        
    // }

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        
        boolean[][] dp = new boolean[n+1][sum+1];
        

        for(int i =0; i <=n; i++){
            
          dp[i][0] = true;
        }
        
        for(int j =1; j<= sum ; j++){
            dp[0][j] = false;
        }
        
        
        
        // now checking the subset
        
        for(int i =1; i <= n; i++){
            for(int j =1; j<= sum; j++){
                
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return  dp[n][sum];
        
        
        
        
        
        
        
      
        
    }
}