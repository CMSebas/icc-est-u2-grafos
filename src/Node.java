import java.util.ArrayList;
import java.util.List;

public class Node {
    int value;
    List<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }

    public int getValue() {
        return value;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
