package src;

import java.util.*;

class ShortestPathFinder {
    private final Map<String, Map<String, Integer>> graph;

    public ShortestPathFinder() {
        graph = new HashMap<>();
    }

    public void addEdge(String source, String destination, int distance) {
        graph.computeIfAbsent(source, k -> new HashMap<>()).put(destination, distance);
        graph.computeIfAbsent(destination, k -> new HashMap<>()).put(source, distance); // Assuming the graph is undirected
    }

    public List<String> findShortestPath(String start, String end) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        distances.put(start, 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (current.equals(end)) {
                return reconstructPath(previous, end);
            }

            for (Map.Entry<String, Integer> neighborEntry : graph.get(current).entrySet()) {
                String neighbor = neighborEntry.getKey();
                int newDistance = distances.get(current) + neighborEntry.getValue();

                if (!distances.containsKey(neighbor) || newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    previous.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        return Collections.emptyList(); // No path found
    }

    private List<String> reconstructPath(Map<String, String> previous, String end) {
        List<String> path = new ArrayList<>();
        String current = end;

        while (current != null) {
            path.add(current);
            current = previous.get(current);
        }

        Collections.reverse(path);
        return path;
    }
}

public class ShortestPathDemo {
    public static void main(String[] args) {
        ShortestPathFinder shortestPathFinder = new ShortestPathFinder();

        // Input edges
        shortestPathFinder.addEdge("Chennai", "Bangalore", 1);
        shortestPathFinder.addEdge("Bombay", "Delhi", 3);
        shortestPathFinder.addEdge("Goa", "Chennai", 2);
        shortestPathFinder.addEdge("Delhi", "Goa", 1);

        // Find shortest path
        List<String> shortestPath = shortestPathFinder.findShortestPath("Bombay", "Bangalore1");

        // Display the result
        System.out.println("Shortest Path: " + String.join("->", shortestPath));
    }
}

