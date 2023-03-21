package java_homework_week_7;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Value : ");
        char ch = scan.next().charAt(0);
        // Using Character class combined with Nested if else to determine inserted value is Alphabet, Number or Symbol.
        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a NUMBER.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
        scan.close();
    }
}

