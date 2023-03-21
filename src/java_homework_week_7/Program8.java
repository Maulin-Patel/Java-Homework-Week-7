package java_homework_week_7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program8 {
    static char l;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input any character from A to F (Uppercase Only):");
        l = scan.next().charAt(0);
        scan.close();
        Program8 obj = new Program8();
        obj.city();
    }

    // Instance method with if else statement assessing the inserted character and printing city name
    // also ensuring inserted character is within permitted range
    public void city() {
        if (l == 'A') {
            System.out.println("Anand");
        } else if (l == 'B') {
            System.out.println("Bhopal");
        } else if (l == 'C') {
            System.out.println("Calcutta");
        } else if (l == 'D') {
            System.out.println("Delhi");
        } else if (l == 'E') {
            System.out.println("Ernakulam");
        } else if (l == 'F') {
            System.out.println("Firozabad");
        } else {
            System.out.println("Invalid Character Entry");
        }
    }
}
