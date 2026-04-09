
import java.util.*;

public class MissingNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

       int[] arr = new int[n-1];

       int[] map = new int[n+1];
       map[0] = 1;
       
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
            map[arr[i]] += 1;
        }

        int ans = 0;

        for(int i = 1; i<=n; i++){
            if(map[i] == 0){
                ans = i;
            }
        }

        System.out.println(ans);
        // int xor = 0;

        // for (int i = 1; i <= n; i++) 
        //     xor ^= i;

        // System.out.println(xor);

        input.close();


    }
}