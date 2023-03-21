package java_homework_week_7;

/** Write a Java program to sum values of an array.
 */
public class Program18 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};// Array declaration
        int sum = 0; // assigning local variable
        for (int i : array)  // for loop for taking all the stored values and adding them
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
