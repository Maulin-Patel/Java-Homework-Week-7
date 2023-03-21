package java_homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Program17 {
    public static void main(String[] args) {
        int[] array1 = { 500, 635, 765, 325, 999,}; // Numeric array declaration
        String[] array2 = { // String array declaration
                "Selenium",
                "Postman",
                "Java",
                "Agile",
                "Scrum"
        };// logic to sort arrays and printing them
        System.out.println("Original numeric array : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(array1));

        System.out.println("Original string array : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : " + Arrays.toString(array2));
    }
}
