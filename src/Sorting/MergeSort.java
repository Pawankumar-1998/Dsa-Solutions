package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 2,5,1,4,6,3,9};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
//        if there is one element in the array then return the array (base condition)
        if (arr.length==1){
            return arr;
        }

        int midIndex = arr.length/2;

//        this function calls the left tree
        int[] leftArray = mergeSort(Arrays.copyOfRange(arr,0,midIndex));
//        this function calls the right tree
        int[] rightArray = mergeSort(Arrays.copyOfRange(arr,midIndex,arr.length));

//        return the merged array
        return mergeSort(leftArray,rightArray);
    }

    static int[] mergeSort(int[] leftArray, int[] rightArray) {
        int[] resultArray = new int[leftArray.length + rightArray.length];

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        int resultArrayIndex = 0;

//        compare the elements in the left array and the right array
        while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length){
//            if the element at the leftArray index is smaller than place it in the result array
            if (leftArray[leftArrayIndex]<rightArray[rightArrayIndex]){
                resultArray[resultArrayIndex] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                resultArray[resultArrayIndex] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
            resultArrayIndex++;
        }

//        there might be a condition where one array gets exhausted
//        in this case the left array may get exhausted
        while (leftArrayIndex<leftArray.length){
            resultArray[resultArrayIndex] = leftArray[leftArrayIndex];
            leftArrayIndex++;
            resultArrayIndex++;
        }

//       in this case if the right array gets exhausted
        while (rightArrayIndex<rightArray.length){
            resultArray[resultArrayIndex] = rightArray[rightArrayIndex];
            rightArrayIndex++;
            resultArrayIndex++;
        }
        return resultArray;
    }
}
