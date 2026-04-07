import java.util.*;

public class CoinPiles {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t-- > 0){
            int a = input.nextInt();
            int b = input.nextInt();

            boolean val = (a+b)%3 != 0 && Math.max(a,b) <= Math.min(a,b);

            if(val == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            // boolean ans = compute(a,b);

            // if(ans == true){
            //     System.out.println("YES");
            // }
            // else{
            //     System.out.println("NO");
            // }
            
        }

        input.close();

    }

    // public static boolean compute(int a,int b){

    //     if(a < 0 || b < 0){
    //         return false;
    //     }

    //     if(a == 0 && b == 0){
    //         return true;
    //     }

    //     return compute(a-2,b-1) || compute(a-1,b-2);

    // }
}
