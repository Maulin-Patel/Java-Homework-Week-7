package java_homework_week_7;
/**
 * Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 */

import java.util.Scanner;

public class Program4 {
    static int month;
    static int year;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Insert Year:");
        int year = scan.nextInt();
        if (year >= 1 && year <= 9999) {
            isLeapYear(year);
            getDaysInMonth(month, year);
        } else {
            System.out.println("false");
        }
        scan.close();
    }
// Static method counting whether inserted year is leap year or not
    public static void isLeapYear(int year) {
        if (year != 0) {
            if (year % 400 == 0)
                System.out.println("true");
            else if (year % 100 == 0)
                System.out.println("true");
            else if (year % 4 == 0)
                System.out.println("true");
            else
                System.out.println("false");
        } else
            System.out.println("false");
    }
// Static method asking user to enter month and assessing how many days should be displayed
    public static void getDaysInMonth(int month, int year) {
        Scanner input = new Scanner(System.in);
        int days = 0;
        System.out.print("Please Insert Month: ");
        month = input.nextInt();
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
            default:
                days = -1;
        }
        System.out.print(days);
        input.close();
    }
}



