package com.javainterview.removeDuplicate;

import java.util.Arrays;

public class removeduplicate2 {
    static void unique_array(int[] arr) {
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int no_unique_elements = arr.length;
        //Comparing each element with all other elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                //If any two elements are found equal
                if (arr[i] == arr[j]) {
                    arr[j] = arr[no_unique_elements-1];
                    no_unique_elements--;
                    j--;
                }
            }
        }
        //Copying only unique elements of arr into array1
        int[] array = Arrays.copyOf(arr, no_unique_elements);

        //Printing arrayWithoutDuplicates

        System.out.println();
        System.out.println("Array with unique values : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        unique_array(new int[]{0, 3, -2, 4, 3, 2});
        //unique_array(new int[]{10, 22, 10, 20, 11, 22});
    }

}
