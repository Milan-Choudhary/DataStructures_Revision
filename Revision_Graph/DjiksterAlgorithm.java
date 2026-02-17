package Revision_Graph;

import java.util.*;

public class DjiksterAlgorithm {
    static class Pair{
        int node;
        int dist;

        Pair(int node,int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int vertices = 6;

        int[][] edges = {{0,1,4},{0,2,4},{1,2,2},{2,3,3},{2,4,1},{2,5,6},{3,5,2},{4,5,3}};

        ArrayList<ArrayList<Pair>> list = new ArrayList<>();

        for(int i = 0; i<vertices; i++){
            list.add(new ArrayList<>());
        }

        int src = input.nextInt();

        int[] distance = new int[vertices];
        Arrays.fill(distance,Integer.MAX_VALUE);

        distance[src] = 0;

        for(int i = 0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int dist = edges[i][2];
            list.get(u).add(new Pair(v, dist));
            list.get(v).add(new Pair(u, dist));
        }


        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.dist == b.dist ? a.node - b.node : a.dist - b.dist);
        
        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int curr = p.node;
            int dist = p.dist;
            if(dist > distance[curr]){
                continue;
            }

            for(Pair P : list.get(curr)){

                int Dist = P.dist;               
                 int next = P.node;

                if(Dist + dist < distance[next]){
                    distance[next] = Dist + dist;
                    pq.add(new Pair(next,distance[next]));
                }

            }
        }

        for(int i = 0; i<distance.length; i++){
            System.out.print(distance[i] + " ");
        }


        input.close();
    }
}
