/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion.Problems;

/**
 *
 * @author chris
 */
public class ArraySum {

    public static int calculateSum(int[] arr) {

        return helper(arr, 0);
    }

    //helper function to keep track of every index of the array
    public static int helper(int[] arr, int index) {
        // Base case: if the index is equal to the array length, return 0
        if (index == arr.length) {
            return 0;
        } else {
            // Recursive case: add the current element and the sum of the rest of the array
            return arr[index] + helper(arr, index + 1);
        }

    }

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array);
        System.out.println("Sum of the array elements: " + sum);
    }

}
