import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int left = 0;
        int right = 0;

        int res = 0;

        while(right < s.length()){

            while(s.charAt(left) != s.charAt(right)){
                left += 1;
            }

            res = Math.max(res,right - left + 1);

            right += 1;

        }

        System.out.println(res);

        input.close();

    }
}
