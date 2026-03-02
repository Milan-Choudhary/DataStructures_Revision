import java.util.*;

public class gcd {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int a = 0;
        int b = 0;

        if(num1 >= num2){
            a = num1;
            b = num2;
        }
        else{
            a = num2;
            b = num1;
        }

        int highest_factor = compute(b,a);

        System.out.println(highest_factor);


        input.close();

    }

    public static int compute(int a,int b){

        if(a == 0){
            return b;
        }

        return compute(b%a,a);


    }
}
