
import java.util.*;

public class GridPaths1{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        char[][] grid = new char[n][n];
        String[] s = new String[n];

        for(int i = 0; i<n; i++){
            s[i] = input.next();
            for(int j = 0; j<n; j++){
                grid[i][j] = s[i].charAt(j);
            }
        }

        int modulo = 1000_000_007;

        long[][] dp = new long[n+1][n+1];

        for(long[] row : dp){
            Arrays.fill(row,-1);
        }

        long ans = compute(grid,0,0,dp);

        System.out.println(ans%modulo);
        

        input.close();

    }

    public static long compute(char[][] grid,int i,int j,long[][] dp){

        if(i < 0 || j < 0 || i>=grid.length || j>= grid[0].length || grid[i][j] == '*'){
            return 0;
        }

        if(i == grid.length - 1 && j == grid[0].length - 1){
            return 1;
        }        

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        long right = compute(grid, i, j+1, dp);
        long down = compute(grid, i+1, j, dp);

        dp[i][j] = (right + down) % 1000_000_007;
        return dp[i][j];

    }

}