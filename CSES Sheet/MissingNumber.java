
import java.util.*;

public class MissingNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long val  = 0;

       int[] arr = new int[n-1];
       
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
            
        }

        int xor = 0;

        for (int i = 1; i <= n; i++) 
            xor ^= i;

        System.out.println(xor);

        input.close();


    }
}