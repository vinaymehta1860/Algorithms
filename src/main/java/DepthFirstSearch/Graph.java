package depthFirstSearch;

import java.util.LinkedList;

public class Graph {
	
	private int nodes;
	private LinkedList<Integer> adj[];
	boolean visited[];
	LinkedList<Integer> queue = new LinkedList<Integer>();
	
	Graph(int n) {
		nodes = n;
		adj = new LinkedList[n];
		visited = new boolean[nodes];
		
		for(int i=0; i<n; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int u, int v) {
		adj[u].add(v);
	}
	
	void DFS(int s) {
		System.out.println("DFS for: " + s);
		queue.add(s);
		visited[s] = true;
		
		while(queue.size() != 0) {
			int u = queue.getFirst();
			
			System.out.println(u + " ");
			
			for(int v : adj[u]) {
				if(!visited[v]) {
					DFS_Visit(v);
				}
			}
			
			queue.removeFirst();
		}
	}
	
	void DFS_Visit(int u) {
		queue.add(u);
		visited[u] = true;
		
		for(int v : adj[u]) {
			DFS_Visit(v);
		}
	}
	
	public static void main( String[] args ) {
		Graph graph = new Graph(15);
		
		graph.addEdge(0, 1);
    	graph.addEdge(0, 2);
    	graph.addEdge(1, 3);
    	graph.addEdge(1, 4);
    	graph.addEdge(2, 5);
    	graph.addEdge(2, 6);
    	graph.addEdge(3, 7);
    	graph.addEdge(3, 8);
    	graph.addEdge(4, 9);
    	graph.addEdge(4, 10);
    	graph.addEdge(5, 11);
    	graph.addEdge(5, 12);
    	graph.addEdge(6, 13);
    	graph.addEdge(6, 14);
		
		graph.DFS(2);
	}
	
}
