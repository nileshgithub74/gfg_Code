class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        
        int n = arr.length;
        ArrayList<Integer> list  = new ArrayList<>();
        int[] prefix =  new int[n];
        
         prefix[0] = arr[0];
          
          for(int i=1; i< n; i++){
              
              prefix[i] = prefix[i-1] + arr[i];
          }
          
          
          for(int i=0; i< prefix.length; i++){
              list.add(prefix[i]);
          }
          
          
          return list;
          
          
        
    }
}