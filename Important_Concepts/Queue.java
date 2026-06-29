package Important_Concepts;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.HashMap;

public class Queue {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of places");

        int n = input.nextInt();

        input.nextLine();

        String[] places = new String[n];

        int[] priorities = new int[n];

        int[] ranks = new int[n];

        for(int i = 0; i<n; i++){

            System.out.println("Enter the name of the place");
            places[i] = input.nextLine();

            System.out.println("Priority");
            priorities[i] = input.nextInt();

            System.out.println("rank");
            ranks[i] = input.nextInt();

            input.nextLine();

        }

        for(int i = 0; i<n; i++){
            
            System.out.print("Place" + " " + places[i] + " " + "priority" + " " + priorities[i] + " " + "rank" + " " + ranks[i]);
            System.out.println();

        }

        //Higher Prioirty and lower rank with rank being unique

        HashMap<Integer,String> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            map.put(ranks[i],places[i]);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b) ->  a.priority == b.priority ? a.rank - b.rank : b.priority - a.priority );

        for(int i = 0; i<n; i++){
            pq.add(new Pair(priorities[i],ranks[i]));
        }

        while(pq.size() > 0){
            Pair p = pq.poll();
            int r = p.rank;

            System.out.println(map.get(r));

        }


        input.close();


    }

    public static class Pair{
        int priority;
        int rank;

        Pair(int priority,int rank){
            this.priority = priority;
            this.rank = rank;
        }


    }
    
}
