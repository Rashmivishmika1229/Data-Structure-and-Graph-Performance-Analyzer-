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

    public boolean addEdge(int from, int to) {
        if (!adjacencyList.containsKey(from)
                || !adjacencyList.containsKey(to)) {
            return false;
        }

        if (adjacencyList.get(from).contains(to)) {
            return false;
        }

        adjacencyList.get(from).add(to);

        if (from != to) {
            adjacencyList.get(to).add(from);
        }

        return true;
    }

    public void display() {
        if (adjacencyList.isEmpty()) {
            System.out.println("The graph has no vertices.");
            return;
        }

        System.out.println("Graph adjacency list:");
        for (Map.Entry<Integer, List<Integer>> entry
                : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public List<Integer> breadthFirstTraversal(int start) {
        List<Integer> order = new ArrayList<>();
        lastSteps = 0;

        if (!adjacencyList.containsKey(start)) {
            return order;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.remove();
            order.add(current);

            for (int neighbor : adjacencyList.get(current)) {
                lastSteps++;

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return order;
    }