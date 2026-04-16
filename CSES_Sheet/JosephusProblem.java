import java.util.*;
import java.util.LinkedList;

public class JosephusProblem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int terms = input.nextInt();

        int[][] queries = new int[terms][2];

        for(int i = 0; i<terms; i++){
            queries[i][0] = input.nextInt();
            queries[i][1] = input.nextInt();
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<terms; i++){
            int n = queries[i][0];
            int k = queries[i][1];

            q.clear();

            for(int j = 1; j<=n; j++){
                q.add(j);
            }

            int ans = 0;

            while(k > 0){
                int store = q.poll();
                q.add(store);
                ans = q.poll();

                k -= 1;

            }

            System.out.println(ans);

        }


        input.close();


    }

}
