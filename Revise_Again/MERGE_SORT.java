package Revise_Again;

import java.util.*;

public class MERGE_SORT {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hello");

        int[] arr = {3,5,2,6,1,4,5};

        merge(arr,0,arr.length - 1);

       for(int k = 0; k<arr.length; k++){
        System.out.print(arr[k] + " ");
       }

        input.close();
    }
   
    public static void merge(int[] arr,int l,int r){

        while(l < r){

            int mid = l + (r-l)/2;

            merge(arr, l, mid);
            merge(arr, mid+1, r);
            mergesort(arr,l,mid,r);

            return;
        }

    }

    public static void mergesort(int[] arr,int l,int mid,int r){

        int[] left = new int[mid - l + 1];
        int[] right = new int[r - mid];

        int[] res = new int[r-l+1];

        for(int i = 0; i< left.length; i++){
            left[i] = arr[i+l];
        }

        for(int i = 0; i < right.length; i++){
            right[i] = arr[i + mid + 1];
        }

        int first = 0;
        int second = 0;

        int index = 0;

        while(first < left.length && second < right.length){

            if(left[first] <= right[second]){
                res[index] = left[first];
                first += 1;
            }
            else{
                res[index] = right[second];
                second += 1;
            }

            index += 1;

        }

        while(first < left.length){
            res[index] = left[first];
            first += 1;
            index += 1;
        }

        while(second < right.length){
            res[index] = right[second];
            second += 1;
            index += 1;
        }

        for(int i = 0; i<res.length; i++){
            arr[i+l] = res[i];
        }
    
    }



}
