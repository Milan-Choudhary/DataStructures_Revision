import java.util.*;

public class BellmanFord {
    public static void main(String[] args){

        int V = 5; 

        int[][] edges = {{0, 1, -1},
                         {0, 2, 4},
                         {1, 2, 3},
                         {1, 3, 2},
                         {1, 4, 2},
                         {3, 2, 5},
                         {3, 1, 1},
                         {4, 3, -3}}; 

        int source = 0; 
        int[] distance = new int[V];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        for (int i = 1; i <= V - 1; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int weight = edge[2];
                if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                }
            }
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        System.out.println("Vertex Distance from Source");

        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + distance[i]);
        }



    }
}
