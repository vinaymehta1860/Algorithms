package breadthFirstSearch;

import java.util.LinkedList;

public class Graph 
{
	private int nodes;
	private LinkedList<Integer> adj[];
	
	Graph(int n) {
		nodes = n;
		adj = new LinkedList[n];
		
		for(int i=0; i<n; ++i) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
	}

	public void BFS(int s) {
		System.out.println("BFS for " + s);
		boolean visited[] = new boolean[nodes+1];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() != 0) {
			int u = queue.getFirst();
			
			System.out.print(u + ", ");
			
			for(int v : adj[u]) {
				if(!visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			}
			
			queue.removeFirst();
		}
	}
	
    public static void main( String[] args )
    {
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
    	
    	graph.BFS(1);
    }
}
