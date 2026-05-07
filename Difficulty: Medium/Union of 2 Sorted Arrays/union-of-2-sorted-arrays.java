class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        
        Set<Integer> set = new TreeSet<>();
        
        for(int x : a){
            set.add(x);
        }
        
        for(int  y : b){
            set.add(y);
        }
        
        for(int x : set){
            result.add(x);
        }
        
        return result;
    }
}
