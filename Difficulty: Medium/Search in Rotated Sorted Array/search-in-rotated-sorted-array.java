class Solution {
    int search(int[] arr, int target) {
        // code here
        
        int n = arr.length;
        int low =0;
        int high =  n-1;
        
        while(low <= high){
            int  mid =  low + (high - low)/2;
            
            // check which part is sorted\
            
            if(arr[mid] == target){
                return mid;
            }
            
            if(arr[low] <=  arr[mid]){
                if(arr[low] <= target &&  target < arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid] < target && target <=  arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            
            
        }
        return -1;
    }
}