
import java.util.*;
public class lcm {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int ans = a*b/compute(a,b);

        System.out.println(ans);

        input.close();

    }

    public static int compute(int a,int b){

        if(a == 0){
            return b;
        }

        return compute(b%a,a);

    }
}
