package java_homework_week_7;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        int a;
        System.out.println("Please Enter a Year : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
// Nested if else ensuring certain conditions are met for the inserted year to be a leap year and displaying message accordingly
        if (((a % 4 == 0) && (a % 100 != 0))) {
            System.out.println("The Specified year is a leap year");
        } else if ((a % 400 == 0)) {
            System.out.println("The Specified year is a leap year");
        } else {
            System.out.println("The Specified year is not a leap year");
        }
        scan.close();
    }
}
