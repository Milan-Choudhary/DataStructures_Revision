import java.util.*;

public class TrailingZeroes {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int ans = 0;

        while(num >= 5){
            ans += num/5;
            num = num/5;
        }

        System.out.println(ans);

        input.close();

    }
}
