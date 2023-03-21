package java_homework_week_7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO
 */

import java.util.Scanner;

public class Program16 {
    static int a;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Number");
        a = scan.nextInt();
        scan.close();
        determine();
    }

    // Static method using Nested if else statement to determine value of inserted number.
    public static void determine() {
        if (a > 0) {
            System.out.println("The given number is of POSITIVE Value.");
        } else if (a < 0) {
            System.out.println("The given number is of NEGATIVE Value.");
        } else {
            System.out.println("The given number is of ZERO Value.");
        }
    }
}
