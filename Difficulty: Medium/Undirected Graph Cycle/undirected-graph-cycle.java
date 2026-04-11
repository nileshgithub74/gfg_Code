class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        
        // given  the edges we  have to convert to the adjlist 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i< V; i++){
            adj.add(new ArrayList<>());
        }
        
        
        for(int i=0; i< edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u); ///  undirected graph-->
        }
        
        boolean[] visited = new boolean[V];
        int n = adj.size();
        
        for(int i=0; i < n; i++){
            if(!visited[i]){
                if(dfs(visited, i, adj, -1)){
                    return true;
                }
            }
    } 
    return false;
    
}
    
    public boolean dfs(boolean[] visited, int source, ArrayList<ArrayList<Integer>> adj, int parent){
    
        visited[source] = true;
        
        for(int neigh : adj.get(source)){
            
            if(!visited[neigh]){
                if(dfs(visited, neigh, adj, source)){
                    return true;
                }
            }else if( visited[neigh] && neigh != parent){
                return true;
            }
            
        }
        return false;
        
    }
    
    
}