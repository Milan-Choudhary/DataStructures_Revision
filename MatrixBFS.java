import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MatrixBFS {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0,0});
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        visited[0][0] = true;

        int[] row = {1,0,-1,0};
        int[] col = {0,1,0,-1};

        while(!q.isEmpty()){

            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            System.out.print(matrix[r][c] + " ");

            for(int i = 0; i<4; i++){
                int rows = r + row[i];
                int cols = c + col[i];

                if(rows < matrix.length && rows >= 0 && cols < matrix[0].length && cols >= 0
                    && visited[rows][cols] == false){
                    visited[rows][cols] = true;     
                    q.add(new int[]{rows,cols});
                }
            }

        }
        
        input.close();

    }

}
