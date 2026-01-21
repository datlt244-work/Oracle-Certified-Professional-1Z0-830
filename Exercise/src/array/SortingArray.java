package array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        //Sorting double array
        double[] arr1 = {2.4, 0.4, 20.0, 0.3};
        System.out.println("Before: " + Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println("After: " + Arrays.toString(arr1));
        System.out.println("=======================================");

        //Sorting int array
        int[] arr2 = {3, 1, 7, 2};
        System.out.println("Before: " + Arrays.toString(arr2));

        Arrays.sort(arr2);
        System.out.println("After: " + Arrays.toString(arr2));
        System.out.println("=======================================");

        //Sorting char array
        char[] arr3 = {'T', 'a', 'D', 't'};
        System.out.println("Before: " + Arrays.toString(arr3));

        Arrays.sort(arr3);
        System.out.println("After: " + Arrays.toString(arr3));
        System.out.println("=======================================");

        //Sorting String1 array
        String[] arr4 = {"le", "Thanh", "dat", "Hello"};
        System.out.println("Before: " + Arrays.toString(arr4));

        Arrays.sort(arr4);
        System.out.println("After: " + Arrays.toString(arr4));
        System.out.println("=======================================");

        //Sorting String2 array
        String[] arr5 = {"3", "300", "20", "14", "35", "37", "4", "70", "ant", "Dog"};
        //14 20 3 35 37 300 4 70 Dog ant
        System.out.println("Before: " + Arrays.toString(arr5));

        Arrays.sort(arr5);
        System.out.println("After: " + Arrays.toString(arr5));
        System.out.println("=======================================");
    }
}
