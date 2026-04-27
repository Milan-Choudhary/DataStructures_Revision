import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class BFS {
    
    public static void main(String[] args){

        int V = 5;

        int[][] edges = {{0,1},{1,2},{2,3},{3,4}};

        Queue<Integer> q = new LinkedList<>();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i<V; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            list.get(u).add(v);
            list.get(v).add(u);
        }

        q.add(0);

        boolean[] visited = new boolean[V];

        while(!q.isEmpty()){

            int num = q.poll();
            visited[num] = true;
            System.out.print(num + " " + "->" + " ");

                for(int i : list.get(num)){
                    if(visited[i] != true){
                        q.add(i);
                    }
                }

        }        


    }

}
