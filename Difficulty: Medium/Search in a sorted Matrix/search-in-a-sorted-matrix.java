class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        // code here
        int m = arr.length;
        int n = arr[0].length;
        
        int low=0;
        int high = m*n-1;
        
        while(low<= high){
            int mid = (low+ high)/2;
            int row = mid/n;
            int col = mid %n;
            if(arr[row][col] == target){
                return true;
            }
            else if(arr[row][col] < target){
                low++;
            }else{
                high--;
            }
        }
        return false;
        
    }
}
