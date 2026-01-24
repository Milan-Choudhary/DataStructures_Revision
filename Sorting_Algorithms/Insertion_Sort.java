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

        //3 4 1 5 2

        // for(int i = 0; i<n-1; i++){
        //     for(int j = i + 1; j<n; j++){
        //         if(arr[i] > arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        // for(int i = 0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        input.close();

    }
}
