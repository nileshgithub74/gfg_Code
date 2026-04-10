class Solution {
   
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = adj.size();

        boolean[] visited = new boolean[n];

        getBfsSolve(adj, visited, result, 0);

        return result;
    }

    private void getBfsSolve(ArrayList<ArrayList<Integer>> adj, boolean[] visited, List<Integer> result, int source) {

        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            result.add(node);


            for (int neigh : adj.get(node)) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }


        }
    }
    
    
}