class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int max= Integer.MIN_VALUE;
        int suffix =1;
        int prefix =1;
        
        for(int i=0; i< n; i++){
            if(suffix ==0)suffix =1;
            if(prefix ==0)prefix=1;
            
            prefix = prefix * arr[i];
            suffix *= arr[n-i-1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
        
        
    }
}