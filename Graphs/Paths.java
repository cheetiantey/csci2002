import java.util.ArrayList;

public interface Paths {
    // constructor: must take (Graph g, int s)
    //      g is the graph to traverse
    //      s is the starting vertex

    // Returns true if a path exist
    boolean hasPath(int v);

    // Returns the path from s to v
    //      [0] = 5
    //      [length-1] = v
    ArrayList<Integer> pathTo(int v);
}