import java.util.*;

public class Exponentiation {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int modulo = 1000000007;
       

        while(n > 0){
            
            int a = input.nextInt();
            int b = input.nextInt();
            long result = 1;

            while(b > 0){
                if((b & 1) == 1){
                    result = (result * a)%modulo;
                }
                a = (int)(((long)a * a)%modulo);
                b = b >> 1;
            }

            System.out.println(result);

            n -= 1;
        }
        

        input.close();

    }
    
}
