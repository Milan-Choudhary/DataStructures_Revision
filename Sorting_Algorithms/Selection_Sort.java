package Sorting_Algorithms;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        int val = arr[0];
        int index = -1;
        for(int i = 0; i<n-1; i++){
            val = arr[i];
            index = -1;
            for(int j = i; j<n; j++){
                if(arr[j] < val){
                    val = arr[j];
                    index = j;
                }
            }

            if(index != -1){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
            
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        input.close();

    }
}
