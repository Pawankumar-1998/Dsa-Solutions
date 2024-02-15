package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,1,9,8,4,7};
        bubbleSort(arr, arr.length-1,0 );
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int row , int col){
        if (row==0){
            return;
        }
        if (col<row){
//            if the col element is greater than its immediate next swap it
            if (arr[col]>arr[col+1]){
//                swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr,row,col+1);
        } else {
//          if the else condition has been hit it indicates it has traversed the row once and the
//            and the highest number has reached its index
            bubbleSort(arr,row-1,0);
        }
    }
}
