//import java.util.*;

public class Trials {
    public static void main(String[] args){

        System.out.println(Byte.MIN_VALUE); // Indicates the minimum value a byte can hold
        System.out.println(Byte.MAX_VALUE); // Indicates the maximum value a byte can hold

        System.out.println(Short.MIN_VALUE); // Indicates the minimum value a short can hold
        System.out.println(Short.MAX_VALUE); // Indicates the maximum value a short can hold

        System.out.println(127 << 1); // Left shift operator (<<) shifts the bits of the number to the left by a specified number of positions.
        // Castign the result to byte to see the effect of overflow
        System.out.println((byte)(127 << 1)); // This will show the overflow effect
        System.out.println(127 >> 1); // Right shift operator (>>) shifts the bits of the number to the right by a specified number of positions.

        System.out.println(Integer.MAX_VALUE << 1); // Left shift on Integer.MAX_VALUE will cause overflow
        System.out.println((int)(Integer.MAX_VALUE << 1)); // This will show the overflow effect for integers

        //Shift operators can be used for efficient multiplication and division by powers of 2
        int number = 5;
        System.out.println(number << 1); // This is equivalent to number * 2
        System.out.println(number >> 1); // This is equivalent to number / 2

        //Cases where shift operators can be useful:
        //1. Bit manipulation: Shift operators are commonly used in bit manipulation tasks, such as setting, clearing, or toggling specific bits in a number.
        //2. Performance optimization: Shift operators can be more efficient than multiplication or
        //  division when dealing with powers of 2, as they operate directly on the binary representation of the number.


        //Cases where shift operators can lead to overflow:
        //1. When shifting a number to the left, if the result exceeds the maximum value that can be stored in the data type, 
        // it will cause an overflow. For example, shifting a byte value of 127 to the left by 1 will result in -128 due to overflow.
        //2. When shifting a number to the right, if the number is negative and the sign bit is shifted into the result,
        //  it can also lead to unexpected results. For example, shifting a negative integer to the right may fill the leftmost bits with 1s, 
        // which can affect the final value.

        

    }
}
