package java_homework_week_7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly Using SWITCH
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program9 {
    static char l;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input any character from A to F (Uppercase Only):");
        l = scan.next().charAt(0);
        scan.close();
        city();
    }
    // Static method assessing the inserted character and printing city name
    // also ensuring inserted character is within permitted range
    public static void city() {
        switch (l) {
            case 'A':
                System.out.println("Anand");
                break;
            case 'B':
                System.out.println("Bhopal");
                break;
            case 'C':
                System.out.println("Calcutta");
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Ernakulam");
                break;
            case 'F':
                System.out.println("Firozabad");
                break;
            default:
                System.out.println("Invalid Character Entry");
        }
    }
}
