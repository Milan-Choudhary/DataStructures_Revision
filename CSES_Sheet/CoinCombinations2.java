package CSES_Sheet;

import java.util.Arrays;
import java.util.Scanner;

public class CoinCombinations2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = input.nextInt();

        int[] coins = new int[n];

        for(int i = 0; i<n; i++){
            coins[i] = input.nextInt();
        }

        long[][] dp = new long[n+1][sum+1];
        for(long[] row : dp){
            Arrays.fill(row,-1);
        }

        long ans = compute(coins,sum,0,dp);

        System.out.println(ans);

        input.close();

    }

    public static long compute(int[] coins,int sum,int i,long[][] dp){

        if(sum == 0){
            return 1;
        }

        if(i == coins.length || sum < 0){
            return 0;
        }

        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        long take = compute(coins,sum-coins[i],i,dp);
        long skip = compute(coins,sum,i+1,dp);

        dp[i][sum] = (skip + take)%1000_000_007;    
        return dp[i][sum];


    }
    
}
