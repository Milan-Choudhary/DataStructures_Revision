import java.util.Scanner;

public class nCr {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int r = input.nextInt();

        long res = 1;

        for(int i = 1; i<=r; i++){
            res = res *(n - i + 1)/i;
        }

        System.out.println(res);

        input.close();

    }
}
