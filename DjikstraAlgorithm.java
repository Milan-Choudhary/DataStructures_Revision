import java.util.*;

public class DjikstraAlgorithm {
    public static class Pair{
        int val;
        int dist;
        Pair(int v,int dist){
            val = v;
            this.dist = dist;
        }
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int V = 6;
        int source = 0;

        int[][] edges = {{0,1,4},{0,2,4},{1,2,2},{2,3,3},{2,4,1},{2,5,6},{3,5,2},{4,5,3}};

        ArrayList<ArrayList<Pair>> list = new ArrayList<>();

        int[] distance = new int[V];

        Arrays.fill(distance,Integer.MAX_VALUE);

        distance[source] = 0;


        for(int i = 0; i<V; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int dist = edges[i][2];

            list.get(u).add(new Pair(v, dist));
            list.get(v).add(new Pair(u,dist));
            
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.dist == b.dist ? a.val - b.val : a.dist - b.dist);

        pq.add(new Pair(source,0));

        while(!pq.isEmpty()){
            Pair allocate = pq.poll();

            int curr_node = allocate.val;
            int curr_dist = allocate.dist;

            if(distance[curr_node] < curr_dist){
                continue;
            }

            for(Pair p : list.get(curr_node)){
                int node = p.val;
                int dist = p.dist;

                if(curr_dist + dist < distance[node]){
                    distance[node] = curr_dist + dist;

                    pq.add(new Pair(node,distance[node]));
                }
            }


        }


        for(int i = 0; i<V; i++){
            System.out.println(distance[i]);
        }

        input.close();

    }
}
