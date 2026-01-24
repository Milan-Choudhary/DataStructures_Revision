package Sorting_Algorithms;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        // 3 4 1 5 2
        // 5 4 3 2 1 

        boolean to_move = true;
        for(int i = 0; i<n; i++){
            to_move = false;
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    to_move = true;
                }
            }

            if(to_move == false){
                break;
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        input.close();

    }
}
