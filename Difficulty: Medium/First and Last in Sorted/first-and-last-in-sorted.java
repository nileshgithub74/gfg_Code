class Solution {
    
    public static int findFirstOcurr(int[] arr, int target){
        int n  = arr.length;
        int low =0;
        int high = n-1;
        int ans = -1;
        
        while(low <= high){
            int mid = low + (high -low)/2;
            
            if(arr[mid] == target){
                ans = mid;
                high = mid-1;
                
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    
     public static int LastOcurr(int[] arr, int target){
        int n  = arr.length;
        int low =0;
        int high = n-1;
        int ans = -1;
        
        while(low <= high){
            int mid = low + (high -low)/2;
            
            if(arr[mid] == target){
                ans = mid;
                low = mid+1;
                
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    
    
    
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        int first  = findFirstOcurr(arr, x);
        int last = LastOcurr(arr, x);
        
        result.add(first);
        result.add(last);
        
        
        return result;
        
        
        
    }
}
