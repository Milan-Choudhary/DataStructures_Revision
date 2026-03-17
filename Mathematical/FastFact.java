
import java.util.Scanner;

public class FastFact{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int modulo = 1000_000_007;
        int n = input.nextInt();

        long[] fact = new long[n+1];
        fact[0] = 1;
        fact[1] = 1;

        for(int i = 2; i<=n; i++){
            fact[i] = (fact[i-1]*i)%modulo;
        }

        long res = fact[n];

        System.out.println(res);

        input.close();

    }
}