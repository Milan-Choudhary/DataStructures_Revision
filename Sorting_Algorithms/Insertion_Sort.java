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

        for(int i = 0; i<n-1; i++){
            int j = i+1;

            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j -= 1;
            }

        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        input.close();

    }
}
