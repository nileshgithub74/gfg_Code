import java.util.*;

class Solution {
    
	ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
	
	public void addEdges(int u, int v) {
		adjlist.get(u).add(v);
		adjlist.get(v).add(u);
	}
	public int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
		
		 adjlist = new ArrayList<>();
		
		for (int i = 0; i<V; i++) {
			adjlist.add(new ArrayList<>());
		}
		
		for (int i = 0; i < edges.size(); i++) {
			int u = edges.get(i).get(0);
			int v = edges.get(i).get(1);
			addEdges(u, v);
		}
		
		// use bfs
		int count = 0;
		
		boolean[] visited = new boolean[V];
		
		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				bfs(adjlist, visited, i);
				count++;
			}
		}
		return count;
	}
	
	public void bfs(ArrayList<ArrayList<Integer>> adjlist, boolean[] visited, int source) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		visited[source] = true;
		
		while (!q.isEmpty()) {
			int removed = q.poll();
			
			for (int i : adjlist.get(removed)) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
			
		}
	}
	
}
