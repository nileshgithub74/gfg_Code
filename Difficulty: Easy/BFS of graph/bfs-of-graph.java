class Solution {
   public void bfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source,ArrayList<Integer> result  ){
         
         Queue<Integer> q = new LinkedList<>();
         q.add(source);
         visited[source] = true;
         
         while(!q.isEmpty()){
             
             int removed = q.poll();
             result.add(removed);
             
             for(int neigh : adj.get(removed)){
                 if(!visited[neigh]){
                     visited[neigh] =true;
                     q.add(neigh);
                 }
             }
             
         }
     }
     
     
     
     
     
     
     
     
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n  = adj.size();
        boolean[] visited = new boolean[n];
        
        bfs(adj, visited,  0, result);
        return result;
        
    }
}