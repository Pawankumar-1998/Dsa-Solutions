package Striver.ArrayPartOne.Brute;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int arr[][] = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        setMatrixZero(arr);
    }

    /**
     * Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.
     * problem link : https://takeuforward.org/data-structure/set-matrix-zero/
     */

    static void setMatrixZero(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==0){
                    for (int k = 0; k < arr.length; k++) {
                        for (int l = 0; l < arr[k].length; l++) {
                            if (k == i || l==j){
                                arr[k][l] = -1;
                            }
                        }
                    }
                }
            }
        }

//        setting the -1 to 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==-1){
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
