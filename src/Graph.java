import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Graph{
    private Set<Node> nodes;

     public Graph() {
        nodes = new HashSet<>();
    }
    //metodo para añadir un nodo
    public Node addNode(int value) {
        Node node = new Node(value);
        nodes.add(node);
        return node;
    }

    public void addEdge(Node src, Node dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src); 
    }

    public void addEdgeUni(Node src, Node des) {
        src.addNeighbor(des);
    }

    public void printGraph() {
        
    }

    public void getDFS(Node startNode) {

    }

    private void getDFSUtil(Node node, boolean[] visited) {
       
    }

    public void getBFS(Node startNode) {
       
    }

    public int[][] getAdjacencyMatrix() {
        
    }

    public void printAdjacencyMatrix() {
        
    }
}