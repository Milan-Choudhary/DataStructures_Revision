import java.util.*;

//Find the error in the DFS implementation for single connected component graph traversal.
public class DFS {
   public static void main(String[] args){

    int V = 5;

    int[][] edges = {{1,2},{2,3},{3,4},{4,5}};

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    for(int i = 0; i<=V; i++){
        list.add(new ArrayList<>());
    }

    for(int i = 0; i<edges.length; i++){
        int u = edges[i][0];
        int v = edges[i][1];

        list.get(u).add(v);


    }

    ArrayList<Integer> res = new ArrayList<>();
    boolean[] visited = new boolean[V+1];

    for(int i = 1; i<=V; i++){
        if(!visited[i])
        dfs(i,list,res,visited);
    }

    for(int i = 0; i<res.size(); i++){
        System.out.println(res.get(i) + " ");
    }


   } 

   public static void dfs(int i,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> res,boolean[] visited){

    visited[i] = true;
    res.add(i);

    for(int neigh : list.get(i)){
        if(!visited[neigh]){
            dfs(neigh, list, res, visited);
        }
    }

   }


}

