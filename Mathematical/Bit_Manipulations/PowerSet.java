
import java.util.*;

public class PowerSet{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] set = {1,2,3};

        //Trying all the subsets using bit manipulations

        for(int i = 0; i < (1 << set.length); i++){

            System.out.print("{");
            for(int j = 0; j<set.length; j++){
                if((i & (1 << j)) > 0){
                    System.out.print(set[j] + " ");
                }
            }
            System.out.println("}");
        }

        //Time complexity is O(n*2^n) where n is the length of the set. 
        // This is because we are trying all the subsets and for each subset we are iterating 
        // through the set to check if the element is present in the subset or not.

        input.close();

    }
}