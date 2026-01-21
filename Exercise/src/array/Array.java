package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] arr1; //declaration

        //instantiation and initialization
        //The number array is an int array
        //its length is 5
        arr1 = new int[5]; //it can hold 5 elements

        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 4;
        arr1[3] = 0;
        arr1[4] = 3;

        int result = arr1[0] + arr1[1] + arr1[2] + arr1[3] + arr1[4];
        System.out.println(result);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);

        int[] arr2 = {1,2,3,4,5};
        arr2[0] = 5;
        System.out.println(Arrays.toString(arr2));

        Object[] mixedArray = {3, 5.7, 2.4F, "Cat", 'h', false};
        System.out.println(Arrays.toString(mixedArray));
        System.out.println(mixedArray.length);
    }
}
