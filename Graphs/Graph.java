import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    
    // Adjacency List
    private ArrayList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public Graph(int numVertices) {
        adj = (ArrayList<Integer>[])new Object[numVertices];
        for (int i = 0; i < numVertices; i++) {
			adj[i] = new ArrayList<Integer>();
		}
    }

    public void addEdge(int v, int u) {
        adj[v].add(u);
        adj[u].add(v);
    }

    public int numVertices() {
		return adj.length;
	}

    public ArrayList<Integer> adjacent(int v) {
        // Copy constructor 
        return new ArrayList<Integer>(adj[v]);
    }

    public static Graph readGraph(String filename) throws FileNotFoundException {

		FileInputStream inFile = new FileInputStream(filename);

		try (Scanner scan = new Scanner(inFile)) {
		
			int numVertices = scan.nextInt();
			int numEdges    = scan.nextInt();
			
			Graph g = new Graph(numVertices);
			for (int i = 0; i < numEdges; i++) {
				int v = scan.nextInt();
				int w = scan.nextInt();
				g.addEdge(v, w);
			}
			
            scan.close();
			return g;
		}
	}
}