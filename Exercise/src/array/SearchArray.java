package array;

import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2, 3, 4, 6};
        System.out.println(Arrays.binarySearch(arr1, 3));

        int[] arr2 = {17, 23, 46, 34};
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2, 34));

        String[] arr3 = {"Ant", "Butterfly", "Cat", "Dog", "Snake"};
        System.out.println(Arrays.binarySearch(arr3, "Ant"));
    }
}
