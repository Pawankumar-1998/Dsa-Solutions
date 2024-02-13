package Arrays_Level_1;

import java.util.Arrays;

public class SetMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5},
        };

        setMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void setMatrix(int[][] arr){
//        this is used to set all the elements in the array to be -1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==0){
                    for (int k = 0; k < arr.length; k++) {
                        for (int l = 0; l < arr[i].length; l++) {
                            if (k==i || l==j){
                                if (arr[k][l]!=0){
                                    arr[k][l] = -22;
                                }
                            }
                        }
                    }
                }
            }
        }

//      this is used to be set all the -1 numbers to 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==-22){
                    arr[i][j] = 0;
                }
            }
        }
    }
}
