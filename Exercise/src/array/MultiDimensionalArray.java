package array;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        //2D array
        int[][] arr2D = new int[3][3];//3 1D array, size of each array is 3

        arr2D[0][0] = 0;
        arr2D[0][1] = 1;
        arr2D[0][2] = 2;
        arr2D[1][0] = 3;
        arr2D[1][1] = 4;
        arr2D[1][2] = 5;
        arr2D[2][0] = 6;
        arr2D[2][1] = 7;
        arr2D[2][2] = 8;

        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));

        System.out.println("===============================");

        int[][] arr2 = {
                {5, 10},
                {15, 20, 25},
                {30, 35, 40, 45}
        };

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        System.out.println("===============================");


        //3D Array
        int[][][] arr3D = {//3D array
                {//first 2D array
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {10,11,12},
                        {13,14,15},
                        {16,17,18}
                },
                {
                        {19,20,21},
                        {22,23,24},
                        {25,26,27}
                }
        };

        System.out.println(Arrays.toString(arr3D));
    }
}
