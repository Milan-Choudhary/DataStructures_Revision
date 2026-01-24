package Sorting_Algorithms;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        input.close();

    }
}
