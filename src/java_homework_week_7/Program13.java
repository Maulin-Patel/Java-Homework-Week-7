package java_homework_week_7;
/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number from 1 to 7");
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Day 1 of the week is MONDAY");
                break;
            case 2:
                System.out.println("Day 2 of the week is TUESDAY");
                break;
            case 3:
                System.out.println("Day 3 of the week is WEDNESDAY");
                break;
            case 4:
                System.out.println("Day 4 of the week is THURSDAY");
                break;
            case 5:
                System.out.println("Day 5 of the week is FRIDAY");
                break;
            case 6:
                System.out.println("Day 6 of the week is SATURDAY");
                break;
            case 7:
                System.out.println("Day 7 of the week is SUNDAY");
                break;
            default:
                System.out.println("Week Contains 7 Days Only!");
        }
        scan.close();
    }
}
