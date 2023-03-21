package java_homework_week_7;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Program10 {
    static int num1, num2;
    static char symbol;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Number:");
        num1 = scan.nextInt();
        System.out.println("Please Enter Second Number:");
        num2 = scan.nextInt();
        System.out.println("Please Select The Calculation You Want To Perform by Entering +, -, *, /:");
        symbol = scan.next().charAt(0);
        calculation();
        scan.close();
    }

    // Static method taking the user inserted values and performing calculation accordingly displaying the result.
    public static void calculation() {
        if (symbol == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (symbol == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (symbol == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else if (symbol == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else {
            System.out.println("Invalid Symbol Selected");
        }
    }
}
