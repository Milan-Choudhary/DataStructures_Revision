import java.util.*;

public class EditDistance {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String s1 = input.next();
        String s2 = input.next();

        int[][] dp = new int[s1.length()][s2.length()];

        for(int[] rows : dp){
            Arrays.fill(rows,-1);
        }

        int ans = compute(s1,s2,s1.length()-1,s2.length()-1,dp);
        System.out.println(ans);

        input.close();
    }

    public static int compute(String s1,String s2,int i,int j,int[][] dp){

        if(i < 0){
            return j + 1;
        }

        if(j < 0){
            return i + 1;
        }

        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] =  compute(s1,s2,i-1,j-1,dp);
            return dp[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int insert = 1 + compute(s1,s2,i,j-1,dp);
        int delete = 1 + compute(s1,s2,i-1,j,dp);
        int replace = 1 + compute(s1,s2,i-1,j-1,dp);

        dp[i][j] = Math.min(insert,Math.min(delete,replace));
        return dp[i][j];

    }
}
