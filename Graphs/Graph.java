import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    
    // Adjacency List
    private ArrayList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public Graph(int numVertices) {
        adj = (ArrayList<Integer>[])new Object[numVertices];
    }

    void addEdge(int v, int u) {
        adj[v].add(u);
        adj[u].add(v);
    }

    public ArrayList<Integer> adjacent(int v) {
        // Copy constructor 
        return new ArrayList<Integer>(adj[v]);
    }

    // public static Graph readGraph(String filename) {
    //     FileInputStream inFile = new FileInputStream(filename);

    //     try(Scanner scan = new Scanner(inFile)) {
    //         int numVertices = scan.nextInt();
    //         int numEdges = scan.nextInt();

    //         Graph g = new Graph(numVertices);
    //         for(int i = 0; i < numEdges; i++) {
    //             int v = scan.nextInt();
    //             int u = scan.nextInt();
    //             g.addEdge(v, u);
    //         }
            
    //         scan.close();
    //         return g;
    //     }
    // }
    // public static void main(String[] args) {

    // }
}