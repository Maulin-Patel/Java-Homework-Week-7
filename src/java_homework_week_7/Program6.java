package java_homework_week_7;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number:");
        int a = scan.nextInt();
        scan.close();
        //if else condition finding whether inserted number is odd or even and displaying the message.
        if (a % 2 == 0) {
            System.out.println(a + " is an even number.");
        } else {
            System.out.println(a + " is an odd number.");
        }
    }
}

