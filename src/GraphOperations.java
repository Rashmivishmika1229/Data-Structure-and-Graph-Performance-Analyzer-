import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphOperations {
    private Map<Integer, List<Integer>> adjacencyList = new LinkedHashMap<>();
    private int lastSteps;

    public boolean addVertex(int vertex) {
        if (adjacencyList.containsKey(vertex)) {
            return false;
        }

        adjacencyList.put(vertex, new LinkedList<>());
        return true;
    }