package Recursion;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        System.out.println(rotatedBs(arr,5,0,arr.length-1));
    }
    static int rotatedBs(int[] arr ,int target , int start , int end){
        int mid = start + (end-start)/2;
//        if the target mid , return (base condition )
        if(target==arr[mid]){
            return mid;
        }
//        if the target is in the first half of the sorted array
        if (arr[start] < arr[mid]){
            if (target >= arr[start] && target < arr[mid]){
                return rotatedBs(arr,target,start,mid-1);
            } else {
                return rotatedBs(arr,target,mid+1,end);
            }
        }

//      if the target is the second half of the array
        if (target>arr[mid] && target <=arr[end]){
            return rotatedBs(arr,target,mid+1,end);
        } else {
            return rotatedBs(arr,target,start,mid-1);
        }
    }
}
