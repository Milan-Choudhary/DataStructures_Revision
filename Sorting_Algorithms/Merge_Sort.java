package Sorting_Algorithms;

import java.util.*;

class Merge_Sort{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        mergeSort(arr,0,arr.length-1);


        input.close();

    }

    public static void mergeSort(int[] arr,int left,int right){

        if(left < right){

            int mid = left + (right - left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr,left,mid,right);

        }


    }

    public static void merge(int[] arr,int left,int mid,int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;


        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for(int i = 0; i<n1; i++){
            a1[i] = arr[left+i];
        }

        for(int i = 0; i<n2; i++){
            a2[i] = arr[mid + i + 1];
        }

        int k = 0;
        int j = 0;
        int index = 0;

        int[] res = new int[right - left + 1];

        while(k < n1 && j < n2){

            if(a1[k] < a2[j]){
                res[index] = a1[k];
                k += 1;
            }
            else{
                res[index] = a2[j];
                j += 1; 
            }

            index += 1;

        }   

        while(j < n2){
            res[index] = a2[j];
            index += 1;
            j += 1;
        }


        while(k < n1){
            res[index] = a1[k];
            index += 1;
            k += 1;
        }

        for(int copy = 0; copy<res.length; copy++){
            arr[copy+left] = res[copy];
        }
               


    }
}
