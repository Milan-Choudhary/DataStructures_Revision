
import java.util.*;

public class PowerSet{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] set = {1,2,3};

        //Trying all the subsets using bit manipulations

        for(int i = 0; i<Math.pow(2,set.length); i++){
            for(int j = 0; j<set.length; j++){
                if((i & (i<<j)) != 0){
                    System.out.print(set[j] + " ");
                }
            }
            System.out.println();
        }

        input.close();

    }
}