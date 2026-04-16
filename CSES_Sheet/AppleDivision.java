import java.util.*;

public class AppleDivision {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];
        long sum = 0;

        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        if(sum%2 == 0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }        


        input.close();

    }
}
