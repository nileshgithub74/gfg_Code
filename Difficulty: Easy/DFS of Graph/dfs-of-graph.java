class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        ArrayList<Integer> result = new ArrayList<>();
        
        boolean[] visited = new boolean[n];
        
        dfsUtil(visited, 0, adj, result);
        
        return result;
    
    }
    
    private void dfsUtil(boolean[] visited, int source,ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result ){
        
        
        visited[source] = true;
        
        result.add(source);
        
        
        for(int neigh : adj.get(source) ){
            
            if( !visited[neigh] ){
                dfsUtil(visited,neigh, adj, result);
            }
            
            
        }
        
        
    }
    
    
}